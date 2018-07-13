class Example { 
   def static Display(clo) {
      clo.call("Inner");
   } 
    
   static void main(String[] args) {
      def str1 = "Hello";
      def clos = { param -> println "${str1} ${param}" }
      clos.call("World");
      str1 = "Welcome";
      clos.call("World");
      Example.Display(clos);
   } 
}