package ExamPractice;

public class LinearProbing {

    private int[] table; // array to store key-value pairs
    // no need to keep track of size since we can check if a slot is empty

    public LinearProbing(int capacity) {
        table = new int[capacity]; // initialize table with given capacity
    }

    public void put(int key, int value) {
        int index = key % table.length; // get the hash index for the key
        while (table[index] != 0 && table[index] != key) { // while slot is occupied and doesn't contain the key
            index = (index + 1) % table.length; // linearly probe to the next slot
        }
        table[index] = value; // store the value in the empty or matching slot
    }

    public int get(int key) {
        int index = key % table.length; // get the hash index for the key
        while (table[index] != 0 && table[index] != key) { // while slot is occupied and doesn't contain the key
            index = (index + 1) % table.length; // linearly probe to the next slot
        }
        return table[index]; // return the value in the empty or matching slot
    }

}
