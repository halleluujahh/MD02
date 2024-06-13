import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Library {
    final static Scanner sc = new Scanner(System.in);
    static List<Category> listC = new ArrayList<>();
    static List<Book> listB = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        try {
            File cateFile = new File("D:\\PT-HN\\MD2-JAVA-BAs\\BTL_1\\categories.txt");
            File bookFile = new File("D:\\PT-HN\\MD2-JAVA-BAs\\BTL_1\\books.txt");
            cateFile.createNewFile();
            bookFile.createNewFile();
            FileReader cateFileReader = new FileReader(cateFile);
            FileReader bookFileReader = new FileReader(bookFile);
            BufferedReader brCateFileReader = new BufferedReader(cateFileReader);
            BufferedReader brBookFileReader = new BufferedReader(bookFileReader);

            String line;
            while ((line = brCateFileReader.readLine()) != null) {
                String[] eachCate = line.split(",");
                int id = Integer.parseInt(eachCate[0]);
                String name = eachCate[1].trim();
                String status = eachCate[2].trim();
                listC.add(new Category(id, name, status.equals("hoạt động") ? true : false));
            }
            String line1;
            while ((line1 = brBookFileReader.readLine()) != null) {
                String[] eachBook = line1.split(",");
                String id = eachBook[0].trim();
                String title = eachBook[1].trim();
                String author = eachBook[2].trim();
                String publisher = eachBook[3].trim();
                int year = Integer.parseInt(eachBook[4].trim());
                String description = eachBook[5].trim();
                int categoryId = Integer.parseInt(eachBook[6].trim());
                listB.add(new Book(id, title, author, publisher, year, description, categoryId));
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file");
        }


        int choice;
        while (true) {
            System.out.println(" ===== QUẢN LÝ THƯ VIỆN =====");
            System.out.println("1. Quản lý Thể loại");
            System.out.println("2. Quản lý Sách ");
            System.out.println("3. Thoát ");
            try {
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        categoryMenu();
                        break;
                    case 2:
                        bookMenu();
                        break;
                    case 3:
                        return;
                    default:
                        System.err.println("Từ 1-3");
                }
            } catch (NumberFormatException e) {
                System.err.println("Lựa chọn không hợp lệ");
            }
        }
    }

    public static void categoryMenu() {
        int choice;
        while (true) {
            System.out.println("===== QUẢN LÝ THỂ LOẠI ===== ");
            System.out.println("1. Thêm mới thể loại ");
            System.out.println("2. Hiển thị danh sách theo tên A – Z");
            System.out.println("3. Thống kê thể loại và số sách có trong mỗi thể loại");
            System.out.println("4. Cập nhật thể loại ");
            System.out.println("5. Xóa thể loại ");
            System.out.println("6. Quay lại ");
            try {
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        addCategory();
                        break;
                    case 2:
                        displayCategory();
                        break;
                    case 3:
                        statisticCateAndBook();
                        break;
                    case 4:
                        updateCategory();
                        break;
                    case 5:
                        removeCategory();
                        break;
                    case 6:
                        return;
                    default:
                        System.err.println("Từ 1-6");
                }
            } catch (NumberFormatException e) {
                System.err.println("Lựa chọn không hợp lệ");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public static void writeCateFile() throws IOException {
        FileWriter cateFileWriter = null;
        try {
            File cateFile = new File("D:\\PT-HN\\MD2-JAVA-BAs\\BTL_1\\categories.txt");
            cateFile.createNewFile();
            cateFileWriter = new FileWriter(cateFile);
            BufferedWriter bwCateFileReader = new BufferedWriter(cateFileWriter);
            for (Category ca : listC) {
                bwCateFileReader.write(ca.toString() + "\n");
            }
            bwCateFileReader.close();
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi file");
        } finally {
            if (cateFileWriter != null) {
                cateFileWriter.close();
            }
        }
    }

    private static void removeCategory() {
        int id;
        boolean flag = false;
        try {
            System.out.println("Nhập vào ID thể loại muốn xóa: ");
            id = Integer.parseInt(sc.nextLine());
            for (Category c : listC) {
                if (c.getId() == id) {
                    for (int i = 0; i < listB.size(); i++) {
                        if (c.getId() == listB.get(i).getCategoryId()) {
                            System.err.println("Thể loại đang có sách");
                            flag = true;
                            return;
                        }

                    }
                    listC.remove(c);
                    writeCateFile();
                    System.out.println("Xóa thành công");
                    return;
                } else {
                    System.out.println("Không tìm thấy ID thể loại");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (
                NumberFormatException e) {
            System.err.println("Id không hợp lệ");
        }
    }

    private static void updateCategory() {
        int id;
        try {
            System.out.println("Nhập vào ID thể loại muốn cập nhật: ");
            id = Integer.parseInt(sc.nextLine());
            for (Category c : listC) {
                if (c.getId() == id) {
                    c.inputUpdate();
                    writeCateFile();
                    System.out.println("Cập nhật thành công");
                    return;
                }
            }
            System.out.println("Không tìm thấy ID thể loại");
        } catch (NumberFormatException | IOException e) {
            System.err.println("Id không hợp lệ");
        }
    }

    private static void statisticCateAndBook() {
        for (int i = 0; i < listC.size(); i++) {
            int count = 0;
            for (int j = 0; j < listB.size(); j++) {
                if (listC.get(i).getId() == listB.get(j).getCategoryId()) {
                    count++;
                }
            }
            System.out.println("Mã thể loại: " + listC.get(i).getId() + " Tên thể loại " + listC.get(i).getName() + " có số sách là: " + count);
        }
    }

    private static void displayCategory() {
        System.out.printf("%-15s|%-15s|%-15s%n", "ID", "Name", "Status");
        listC.stream().sorted(Comparator.comparing(Category::getName)).forEach(Category::output);
    }

    private static void addCategory() throws IOException {
        Category c = new Category();
        FileWriter cateFileWriter = null;
        c.input();
        listC.add(c);
        try {
            File cateFile = new File("D:\\PT-HN\\MD2-JAVA-BAs\\BTL_1\\categories.txt");
            cateFile.createNewFile();
            cateFileWriter = new FileWriter(cateFile, true);
            BufferedWriter bwCateFileReader = new BufferedWriter(cateFileWriter);
            bwCateFileReader.write(listC.get(listC.size() - 1).toString() + "\n");
            bwCateFileReader.close();
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi file");
        } finally {
            if (cateFileWriter != null) {
                cateFileWriter.close();
            }
        }
    }

    public static void bookMenu() {
        int choice;
        while (true) {
            System.out.println("===== QUẢN LÝ SÁCH =====");
            System.out.println("1. Thêm mới sách ");
            System.out.println("2. Cập nhật thông tin sách");
            System.out.println("3. Xóa sách ");
            System.out.println("4. Tìm kiếm sách  ");
            System.out.println("5. Hiển thị danh sách sách theo nhóm thể loại");
            System.out.println("6. Quay lại ");
            try {
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        addBook();
                        break;
                    case 2:
                        updateBook();
                        break;
                    case 3:
                        removeBook();
                        break;
                    case 4:
                        findBook();
                        break;
                    case 5:
                        displayBookByCategory();
                        break;
                    case 6:
                        return;
                    default:
                        System.err.println("Từ 1-6");
                }
            } catch (NumberFormatException e) {
                System.err.println("Lựa chọn không hợp lệ");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }

    private static void displayBookByCategory() {
        for (int i = 0; i < listC.size(); i++) {
            int count = 0;
            System.out.println("Thể loại " + listC.get(i).getName());
            for (int j = 0; j < listB.size(); j++) {
                if (listC.get(i).getId() == listB.get(j).getCategoryId()) {
                    count++;
                    System.out.printf("%-3s %s %s %n"," ", "Sách", listB.get(j).getTitle());
                }
            }
            if(count==0){
                System.out.printf("%-3s %s %n", " ", "Không có sách");
            }
        }
    }

    private static void findBook() {
        Book b = new Book();
        String name;
        System.out.println("Nhập vào tên sách muốn tìm: ");
        name = sc.nextLine();
        System.out.printf("%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s%n", "ID"
                , "Title", "Author", "Publisher", "Year", "Description", "CategoryId");
        for (Book b1 : listB) {
            if (b1.getTitle().contains(name) || b1.getAuthor().contains(name) || b1.getPublisher().contains(name)) {
                b1.output();
                return;
            }
        }
        System.out.println("Không tìm thấy ID sách");
    }

    private static void removeBook() throws IOException {
        Book b = new Book();
        String id;
        String idPattern = "[B\\w]{4}";
        while (true) {
            System.out.println("Nhập vào ID sách muốn xóa: ");
            id = sc.nextLine();
            if (Pattern.matches(idPattern, id)) {
                break;
            }
            System.out.println("ID bắt đầu bằng B, 4 ký tự");
        }
        for (Book b1 : listB) {
            if (b1.getId().equals(id)) {
                listB.remove(b1);
                writeBookFile();
                System.out.println("Xóa thành công");
                return;
            }
        }
        System.out.println("Không tìm thấy ID sách");
    }

    private static void updateBook() throws IOException {
        Book b = new Book();
        String id;
        String idPattern = "[B\\w]{4}";
        while (true) {
            System.out.println("Nhập vào ID sách muốn cập nhật: ");
            id = sc.nextLine();
            if (Pattern.matches(idPattern, id)) {
                break;
            }
            System.out.println("ID bắt đầu bằng B, 4 ký tự");
        }
        for (Book b1 : listB) {
            if (b1.getId().equals(id)) {
                b1.inputUpdate();
                writeBookFile();
                System.out.println("Cập nhật thành công");
                return;
            }
        }
        System.out.println("Không tìm thấy ID sách");
    }

    public static void writeBookFile() throws IOException {
        FileWriter bookFileWriter = null;
        try {
            File bookFile = new File("D:\\PT-HN\\MD2-JAVA-BAs\\BTL_1\\books.txt");
            bookFile.createNewFile();
            bookFileWriter = new FileWriter(bookFile);
            BufferedWriter bwBookFileReader = new BufferedWriter(bookFileWriter);
            for (Book b : listB) {
                bwBookFileReader.write(b.toString() + "\n");
            }
            bwBookFileReader.close();
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi file");
        } finally {
            if (bookFileWriter != null) {
                bookFileWriter.close();
            }
        }
    }

    private static void addBook() throws IOException {
        Book b = new Book();
        FileWriter bookFileWriter = null;
        b.input();
        listB.add(b);
        try {
            File bookFile = new File("D:\\PT-HN\\MD2-JAVA-BAs\\BTL_1\\books.txt");
            bookFile.createNewFile();
            bookFileWriter = new FileWriter(bookFile, true);
            BufferedWriter bwBookFileReader = new BufferedWriter(bookFileWriter);
            bwBookFileReader.write(listB.get(listB.size() - 1).toString() + "\n");
            bwBookFileReader.close();
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi file");
        } finally {
            if (bookFileWriter != null) {
                bookFileWriter.close();
            }
        }
    }
}
