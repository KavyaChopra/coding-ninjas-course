package stacks;

// LIFO -> {Last In First Out}
public class StackUsingArray {
    private int topIndex;
    private int[] data;

    public StackUsingArray() {
        topIndex = -1;
        data = new int[3];
    }

    public void push(int elem) {
        if(topIndex == data.length - 1) {
            int[] temp = new int[2 * data.length];
            System.arraycopy(data, 0, temp, 0, data.length);
            temp[++topIndex] = elem;
            data = new int[temp.length];
            System.arraycopy(temp, 0, data, 0, temp.length);
        }
        else {
            data[++topIndex] = elem;
        }
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }

    public int pop() throws Exception {
        if(topIndex == -1)
            throw new Exception("Empty Stack!");
        int ans = data[topIndex];
        topIndex--;
        return ans;
    }

    public int size() {
        return topIndex + 1;
    }

    public void top() throws Exception{
        if(topIndex == -1)
            throw new Exception("Empty Stack!");
        System.out.println(data[topIndex]);
    }

  public static void main(String[] args) throws Exception {
    StackUsingArray s = new StackUsingArray();
    s.push(5);
    s.push(5);
    s.push(5);
    s.push(5);
    System.out.print(s.pop() + " ");
    System.out.print(s.pop() + " ");
    System.out.print(s.pop() + " ");
    System.out.print(s.pop() + " ");
  }
}
