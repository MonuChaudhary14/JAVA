package Classes;

public class Encapsulation {

    public static void main(String[] args) {

        data Data = new data(1, 2, 3);
        Data.setData1(22);
//        Data.getData1();

        System.out.println(Data);   // Here toString is method is invoked

    }

}

    class data{

        private int data1;
        private int data2;
        private int data3;

        public data(int data1 ,int data2, int data3){    //By making this parameterized constructor we can mandate to initialise the variables of the object

            this.data1 = data1;
            this.data2 = data2;
            this.data3 = data3;
        }

        void setData1(int data1) {     // There is a default specifier(package-private) so it can be used inside the package
            // we can also add condition in these

            if (data1 > 50) {


                this.data1 = data1;
            }
            else{
                this.data1 = 0;
            }
        }

        int getData1(){
            return this.data1;
        }

        @Override
        public String toString() {
            return "data{" +
                    "data1=" + data1 +
                    ", data2=" + data2 +
                    ", data3=" + data3 +
                    '}';
        }
    }

