package L2;

public class SwitchDemo {
    public static void main(String[] args) {
//        switch (expresion){
//            case constant1:
//                sequence of operators
//                break;
//        case constant2:
//                sequence of operators
//                break;
//       default:
//sequence of operators
//        }

        int i;
//        for (i=0; i <10; i++ ){
//            switch (i){
//                case 0:
//                    System.out.println("i is equal 0");
//                    break;
//                case 1:
//                    System.out.println("i is equal 1");
//                    break;
//                case 2:
//                    System.out.println("i is equal 2");
//                    break;
//                case 3:
//                    System.out.println("i is equal 3");
//                    break;
//                case 4:
//                    System.out.println("i is equal 4");
//                    break;
//                default:
//                    System.out.println("i is equal of greater than 5");
//
//
//            }
//    }

        for (i=0; i <10; i++ ){
            switch (i) {
                case 0 -> System.out.println("i is equal 0");
                case 1 -> System.out.println("i is equal 1");
                case 2 -> System.out.println("i is equal 2");
                case 3 -> System.out.println("i is equal 3");
                case 4 -> System.out.println("i is equal 4");
                default -> System.out.println("i is equal of greater than 5");
            }
        }




    }
}
