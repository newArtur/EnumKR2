import org.w3c.dom.ls.LSOutput;

public enum KR {
    OSH("Osh",2){
        @Override
        public String toString() {
            return super.toString();
        }
    },
    DGALALABAD("Djalalabad",3){
        @Override
        public String toString() {
            return super.toString();
        }
    },
    TALAS("Talas",7){
        @Override
        public String toString() {
            return super.toString();
        }
    },
    NARYN("Naryn",1){
        @Override
        public String toString() {
            return super.toString();
        }
    },
    CHUI("Chui",2){
        @Override
        public String toString() {
            return super.toString();
        }
    },
    BATKEN(){
        @Override
        public String toString() {
            return super.toString();
        }
    },
    YSSYKKOL(){
        @Override
        public String toString() {
            return super.toString();
        }
    };

    private String name;
    private int age;

    private KR(String name,int age){
        this.name=name;
        this.age=age;
    }

    private KR(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "KR{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
