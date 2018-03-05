public class klasespvz {




   public static void main(String[]args){
       // objekto sukurimas, perduoda parametrus i konstruktoriu
     SecondClassExample secondClassExample = new SecondClassExample(67);
     secondClassExample.testMethod();// metodo iskvietimas
   }
}
class SecondClassExample{
    private int id;
// klase be public nes klaseje gali buti tik viena public
    public SecondClassExample(){
      id = 10;// klases lygio kintamasis
    }
    public SecondClassExample(int id){
        // id=ids; /// galima nes skiriasi vardai
       this.id = id;
    }

   public void testMethod(){
       System.out.println("this is my method :)"+id);
   }

}
