// 9. Explain and implement the concept of access modifiers in Java.
    class AccessExample {
        public String publicMessage = "This is public.";
        protected String protectedMessage = "This is protected.";
        String defaultMessage = "This is default.";
        private String privateMessage = "This is private.";
    }

    public class Program_9 {
        public static void main(String[] args) {
            AccessExample obj = new AccessExample();
            System.out.println(obj.publicMessage);
            System.out.println(obj.protectedMessage);
            System.out.println(obj.defaultMessage);
            // System.out.println(obj.privateMessage); // COMPILE ERROR!
        }
    }