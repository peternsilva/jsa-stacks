// JAVA STACK
public class MyStack {
   private int maxSize;
   private long[] stackArray;
   private int numItems;

	 // constructor
   public MyStack(int s) {
      maxSize = s;
      stackArray = new long[maxSize];
      numItems = -1;
   }

   public void push(long j) {
      stackArray[++numItems] = j;
   }

   public long pop() {
      return stackArray[numItems--];
   }

   public long peek() {
      return stackArray[numItems];
   }

   public boolean isEmpty() {
      return (numItems == -1);
   }

   public static void main(String[] args) {
      MyStack theStack = new MyStack(10);
      theStack.push(10);
      theStack.push(20);
      theStack.push(30);
      theStack.push(40);
      theStack.push(50);

      while (!theStack.isEmpty()) {
         long value = theStack.pop();
         System.out.print(value);
         System.out.print(" ");
      }
      System.out.println("");
   }
}
