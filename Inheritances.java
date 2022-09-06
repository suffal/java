
class mobile { // parents class 
    String os;
    int price;
    int dimention;

    void playgame() {   // fution                                                                         class mobile-----parrents class or supper class
        System.out.println("sumsung is good performance of gameing");      //                                  |
                                                                           //                                     /\
    }                                                                                      //                    /  \
}                                            //                                                                 /     \
  //                                                                                              sumsung class       apple class   -- child class or sub class
class Samsung extends mobile { // this is nchild class extend  the mobile class     //           child class extend to parrent class if not found the data of child class 
    //                                                                                            to put the dta for parrents class.
    void playgame() {  // function
        System.out.println("best of luck");
    }

}

 class apple extends mobile{   // this is child class extends the mobile class

 }


public class Inheritances{  //  this is public class ya main class
    public static void main(String[] args) {  // this is main mathod or main function
        Samsung samsung = new Samsung(); // this is object of sumsung class 
        samsung.playgame();//call the mathod playgame in sumsung class.

        apple apple = new apple(); // this is object of aapple class
        apple.playgame();// call the function in apple class if functin is not found the apple class to put the function for parrents class
    }
}

// difination of inheritance-

//  In  java  one class can easily inherit the attributs and methods from some other class .this mechnism of acquiring objects and properties from 
//   some other class  is known  as inheritence in java.
//
//     