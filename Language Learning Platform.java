import java.util.*;

class LanguageLearningPlatform {
    private Map<String, List<String>> courses;

    public LanguageLearningPlatform() {
        this.courses = new HashMap<>();
    }

    public void addCourse(String language, List<String> topics) {
        courses.put(language, topics);
    }

    public void displayCourses() {
        for (String language : courses.keySet()) {
            System.out.println("Language: " + language);
            System.out.println("Topics: " + courses.get(language));
            System.out.println();
        }
    }

    public void startCourse(String language) {
        if (courses.containsKey(language)) {
            System.out.println("Starting " + language + " course...");
            System.out.println("Topics to cover: " + courses.get(language));
        } else {
            System.out.println("Course not found!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LanguageLearningPlatform platform = new LanguageLearningPlatform();

        // Adding courses
        List<String> javaTopics = Arrays.asList("Syntax", "OOP Concepts", "Collections", "Multithreading");
        platform.addCourse("Java", javaTopics);

        List<String> pythonTopics = Arrays.asList("Syntax", "Data Structures", "Functions", "Modules");
        platform.addCourse("Python", pythonTopics);

        List<String> cppTopics = Arrays.asList("Pointers", "Classes", "Templates", "STL");
        platform.addCourse("C++", cppTopics);

        // Displaying courses
        platform.displayCourses();

        // Starting a course
        platform.startCourse("Java");
    }
}
