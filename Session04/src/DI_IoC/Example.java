package DI_IoC;

public class Example {
    public interface Outfit {
        void wear();
    }

    public class Bikini implements Outfit {
        public void wear() {
            System.out.println("Đã mặc Bikini");
        }
    }

    public class Girl {
        private Outfit outfit;

        public Girl(Outfit outfit) {
            this.outfit = outfit;
        }

        public void dressUp() {
            outfit.wear();
        }
    }

//    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Girl girl = context.getBean(Girl.class);
//        girl.dressUp();
//    }
}
