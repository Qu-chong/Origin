public  class Week3 {
    static class A {
        public void fun1() {
            System.out.println("A--> public void fun1(){}");
        }

        public void fun2() {
            this.fun1();

        }

        static class B extends A {
            public void fun1() {
                System.out.println("B--> public void fun1(){}");
            }

            public void fun3() {
                System.out.println("B--> public void fun3(){}");
            }
        }

        static class C extends A {
            public void fun1(){
                System.out.println("C--> public void fun1(){}");
            }
            public void fun5() {
                System.out.println("C--> public void fun3(){}");
            }
        }

        public static class PolDemo {
            public static void main(String[] args) {
                fun(new B());
                fun(new C());
            }

            public static void fun(A a) {
                a.fun1();
            }
        }
    }
}

