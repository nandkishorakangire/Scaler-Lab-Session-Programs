package generics_n_collections_lab;

    import java.io.*;
import java.util.*;

    class CustomPair implements Comparable<CustomPair> {
        String key;
        int value;

        public CustomPair(String key, int value) {
            this.key = key;
            this.value = value;
        }

        public String toString() {
            return "(" + key + "," + value + ")";
        }

        @Override
        public int compareTo(CustomPair other) {
            // Compare based on keys
            int keyComparison = this.key.compareTo(other.key);

            if (keyComparison != 0) {
                return keyComparison;
            } else {
                // Compare based on values if keys are equal
                return Integer.compare(this.value, other.value);
            }
        }
    }