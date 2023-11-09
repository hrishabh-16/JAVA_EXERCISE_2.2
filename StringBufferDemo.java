public class StringBufferDemo {
    public static void main(String[] args) 
    {
        StringBuffer sb = new StringBuffer("Welcome to the world of Java Programming");

        // 1. append()
        sb.append(" This is a String Buffer.");
        System.out.println("1. append(): " + sb);

        // 2. insert()
        sb.insert(15, "New ");
        System.out.println("2. insert(): " + sb);

        // 3. replace()
        sb.replace(0, 10, "Replaced");
        System.out.println("3. replace(): " + sb);

        // 4. delete()
        sb.delete(0, 8);
        System.out.println("4. delete(): " + sb);

        // 5. charAt()
        char character = sb.charAt(7);
        System.out.println("5. charAt(7): " + character);

        // 6. setCharAt()
        sb.setCharAt(0, 'H');
        System.out.println("6. setCharAt(): " + sb);

        // 7. length()
        int length = sb.length();
        System.out.println("7. length(): " + length);

        // 8. capacity()
        int capacity = sb.capacity();
        System.out.println("8. capacity(): " + capacity);

        // 9. ensureCapacity()
        sb.ensureCapacity(50);
        System.out.println("9. EnsureCapacity(50): " + sb.capacity());

        // 10. toString()
        String str = sb.toString();
        System.out.println("10. toString(): " + str);

        // 11. substring(int start)
        String sub1 = sb.substring(9);
        System.out.println("11. substring(9): " + sub1);

        // 12. substring(int start, int end)
        String sub2 = sb.substring(1, 5);
        System.out.println("12. substring(1, 5): " + sub2);
    }
}
