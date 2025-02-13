package org.example;

public class WorkLoadService {
    public Float workLoadService(String workloadService) {
        float index = 0;

        if (workloadService == "very high") {
            return index = 1.6f;
        } else if (workloadService == "high") {
            return index = 1.4f;
        } else if (workloadService == " small high") {
            return index = 1.2f;
        } else if (workloadService == "normal") {
            return index = 1f;
        }
        return index;
    }
}
