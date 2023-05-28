package L2_Conditions_Loops;
//Упражнение 2.2
// Отображение таблицы истинности для логических операций
public class LogicalOpTable {
    public static void main(String[] args) {
        boolean p,q;

        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");

        p = true;
        q = true;
        if (p==true){
            System.out.print("1\t\t");
        }else {
            System.out.print("0\t\t");
        }

        if (q==true){
            System.out.print("1\t\t");
        }else {
            System.out.print("0\t\t");
        }

        if ((p&q)==true ){
            System.out.print("1\t\t");
        }else {
            System.out.print("0\t\t");
        }

        if ((p|q)==true ){
            System.out.print("1\t\t");
        }else {
            System.out.print("0\t\t");
        }

        if ((p^q)== true ){
            System.out.print("1\t\t");
        }else {
            System.out.print("0\t\t");
        }

        if (!p){
            System.out.println("1\t\t");
        }
        else {
            System.out.println("0\t\t");
        }


        p = true;
        q = false;
        if (p==true){
            System.out.print("1\t\t");
        }else {
            System.out.print("0\t\t");
        }

        if (q==true){
            System.out.print("1\t\t");
        }else {
            System.out.print("0\t\t");
        }

        if ((p&q)==true ){
            System.out.print("1\t\t");
        }else {
            System.out.print("0\t\t");
        }

        if ((p|q)==true ){
            System.out.print("1\t\t");
        }else {
            System.out.print("0\t\t");
        }

        if ((p^q)== true ){
            System.out.print("1\t\t");
        }else {
            System.out.print("0\t\t");
        }

        if (!p){
            System.out.println("1\t\t");
        }
        else {
            System.out.println("0\t\t");
        }

        p = false;
        q = true;
        if (p==true){
            System.out.print("1\t\t");
        }else {
            System.out.print("0\t\t");
        }
        if (q==true){
            System.out.print("1\t\t");
        }else {
            System.out.print("1\t\t");
        }

        if ((p&q)==true ){
            System.out.print("1\t\t");
        }else {
            System.out.print("0\t\t");
        }

        if ((p|q)==true ){
            System.out.print("1\t\t");
        }else {
            System.out.print("0\t\t");
        }

        if ((p^q)== true ){
            System.out.print("1\t\t");
        }else {
            System.out.print("0\t\t");
        }

        if (!p){
            System.out.println("1\t\t");
        }
        else {
            System.out.println("0\t\t");
        }

        p = false;
        q = false;
        if (p==true){
            System.out.print("1\t\t");
        }else {
            System.out.print("0\t\t");
        }
        if (q==true){
            System.out.print("1\t\t");
        }else {
            System.out.print("0\t\t");
        }

        if ((p&q)==true ){
            System.out.print("1\t\t");
        }else {
            System.out.print("0\t\t");
        }

        if ((p|q)==true ){
            System.out.print("1\t\t");
        }else {
            System.out.print("0\t\t");
        }

        if ((p^q)== true ){
            System.out.print("1\t\t");
        }else {
            System.out.print("0\t\t");
        }

        if (!p){
            System.out.print("1\t\t");
        }
        else {
            System.out.println("0\t\t");
        }


//        System.out.print(p + "\t" + q + "\t");
//        System.out.print((p&q)  + "\t" + (p|q) + "\t");
//        System.out.println((p^q) + "\t" + (!p));
//
//        p = true;
//        q = false;
//        System.out.print(p + "\t" + q + "\t");
//        System.out.print((p&q)  + "\t" + (p|q) + "\t");
//        System.out.println((p^q) + "\t" + (!p));
//
//        p = false;
//        q = true;
//        System.out.print(p + "\t" + q + "\t");
//        System.out.print((p&q)  + "\t" + (p|q) + "\t");
//        System.out.println((p^q) + "\t" + (!p));
//
//        p = false;
//        q = false;
//        System.out.print(p + "\t" + q + "\t");
//        System.out.print((p&q)  + "\t" + (p|q) + "\t");
//        System.out.println((p^q) + "\t" + (!p));

    }
}
