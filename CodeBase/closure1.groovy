class Example1 {
   static void main(String[] args) {
      def clos = {param->println "Hello ${param}"};
      clos.call("World");
   } 
}