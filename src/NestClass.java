class OuterClass { 
    int x = 17;
    int z = 26;
  
    class InnerClass {
        int y = 22;
        public int myInnerMethod(){
            return z;
        }
    }
  }
// Nested class example that is called from main class file