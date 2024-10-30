package upvote;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileRecommendationStorage implements RecommendationStorage {
    private String filename;

    public FileRecommendationStorage(String filename) {
        this.filename = filename;
    }

    @Override
    public void save(List<UpvoteModelDTO> recommendations) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(recommendations);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<UpvoteModelDTO> load() {
        List<UpvoteModelDTO> recommendations = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            recommendations = (List<UpvoteModelDTO>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return recommendations;
    }
}
