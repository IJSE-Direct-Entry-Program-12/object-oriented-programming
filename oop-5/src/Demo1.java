public class Demo1 {
    {   // Instance Initializer
        int x = 10;     // Local Variable
        {   // Block
            int y = 20;     // Local Variable
        }
        class Something {        // Local [Inner] Class
            int c = 20;         // Instance Variable
            {                   // Instance Initializer
                int y = 20;     // Local Variable
            }
        }
    }
    class Abc{}                 // Regular Inner Classes (Member Class)
    static class Edf{}          // Static Nested Classes (Member Class)
}
