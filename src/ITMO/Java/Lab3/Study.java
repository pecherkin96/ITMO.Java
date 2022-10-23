package ITMO.Java.Lab3;

class Study {

//    Допишите в класс «Study» конструктор, что будет принимать один параметр
//    и будет устанавливать значение этого параметра в поле «course».
//    Создайте объект класса «Study». В качестве значения для поля «course» установите текст:
//        «Изучение Java - это просто!». Обратитесь к методу «printCourse» для вывода значения поля «course».
//
//    class Study {
//
//        private String course;
//
//        //TODO
//
//        public String printCourse() {
//            return this.course;
//        }
//    }
//
//    class JavaProgram {
//        public static void main(String[] args) {
//            //TODO
//        }


        private String course;

    public Study(String parameter){
        this.course = parameter;
    }

    public String printCourse() {
        return this.course;
    }
}

class JavaProgram {
    public static void main(String[] args) {
        Study study = new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());
    }

}
