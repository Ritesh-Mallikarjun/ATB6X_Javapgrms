package batch11April;

public class Lab009 {
    public static void main(String[] args) {
         String a1="hello world"; //a1 references to string literal "hello world" , which is stored in string constant pool.
        System.out.println("a1 string is: "+a1);
        String a2=a1.concat(", How are you !!!!");
        //a1 still references to "hello world",after concatenation which remains unchanged (immutable)
        // and a2 references the newly created String "hello world, how are you !!!" which is a separate object in memory.
        //this operation actually involves concatenating "hello world" with " how are you" and it does not modify a1, instead it
        //new string object and assigns it to string a2;
        System.out.println("After concatenation a2 :"+a2);
        System.out.println("----------------");
        System.out.println(a1.toLowerCase()); //a1 which remains unchanged (immutable).
        System.out.println(a1.toUpperCase()); //a1 which remains unchanged (immutable).
        //a1="ninety";
        System.out.println(a1.length());

        //The key point here is that once a String object is created, its content cannot be modified.
        // Any operation that seems to modify a String actually creates a new String object with the modified content,
        // leaving the original String unchanged.This behavior illustrates immutability in action within Java's String class.
    }
}
