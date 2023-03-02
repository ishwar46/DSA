package Hash;

public class Hashing {

    int keys[];
    int values[];
    int capacity;

    Hashing(int capacity) // constructor banaune
    {
        this.capacity = capacity;
        keys = new int[capacity];
        values = new int[capacity];
       for (int i = 0; i < capacity; i++) {
           keys[i] = -1;
           values[i] = -1;
       }
    }

   //INsert
    public void insert(int key, int value) {
        int temp = key % 10; //hash function
        int i = temp; // check for empty space
        if (keys[i] == -1) { // if empty
            keys[i] = key;
            values[i] = value;
        }

        // if not empty
        else if(keys[i] == key) // if key already exists the update the value
        {
            values[i] = value;
        }
        // if key already exists and value is different
        else {
            //loop through the array
             do {
                 i = (i + 1) % 10; // linear probing

                 while (keys[i] != -1 && keys[i] != key) ;
                 // linear probing
                 i = (i + 1) % 10;
                 if (keys[i] == -1) {
                     keys[i] = key;
                     values[i] = value;
                     break;

                 }
             } while (i != temp); // array is full
        }
    }

    //now get the value
    public int get(int key)
    {
        int temp = key % 10;
        int i = temp;
        while (keys[i] != -1) // if the key is not empty
        {
            if (keys[i] == key) // if the key is found
            {
                return values[i];
            }
            i = (i + 1) % 10;
        }
        return -1;
    }
}
