package com.betulgulcicek;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Betul Gulcicek
 */
public class FileOperation {

    String userFile = "user.txt";
    String adminFile = "admin.txt";
    String teacherFile = "teacher.txt";
    String tutorFile = "tutor.txt";
    String studentFile = "student.txt";
    String assignmentFile = "assignment.txt";
    String courseFile = "course.txt";

    /**
     * no parameter constructor
     */
    public FileOperation() {

    }

    /**
     * teacher.txt dosyasindaki teacher bilgilerini teacher ArrayList'ine
     * doldurup, bu ArrayListi return eden method
     *
     * @param teacher Teacher object
     * @return for exit system
     * @throws FileNotFoundException not found teacher.txt file
     * @throws IOException for user input errors
     * @throws IndexOutOfBoundsException ArrayList.size()'in disina cikma
     * durumlari
     */
    public ArrayList<Teacher> loadTeacherFile(ArrayList<Teacher> teacher) throws FileNotFoundException, IOException, IndexOutOfBoundsException {
        List list = new ArrayList();

        try (BufferedReader reader = new BufferedReader(new FileReader(teacherFile))) {
            String line;
            int i = 0;

            while ((line = reader.readLine()) != null) {
                if (line == null) {
                    break;
                }
                String[] parts = line.split("-");
                //  String[] users = null;
                for (String part : parts) {

                    list.add(part);

                }
            }
            for (i = 0; i < list.size(); i += 5) {

                String id = (String) list.get(i);
                String name = (String) list.get(i + 1);
                String email = (String) list.get(i + 2);

                Teacher teacherObj = new Teacher(id, name, email);
                teacher.add(teacherObj);
            }
        }
        return teacher;
    }

    /**
     * tutor.txt dosyasindaki tutor bilgilerini tutor ArrayList'ine doldurup, bu
     * ArrayListi return eden method
     *
     * @param tutor Tutor object
     * @return for exit system
     * @throws FileNotFoundException not found tutor.txt file
     * @throws IOException for user input errors
     * @throws IndexOutOfBoundsException ArrayList.size()'in disina cikma
     * durumlari
     */
    public ArrayList<Tutor> loadTutorFile(ArrayList<Tutor> tutor) throws FileNotFoundException, IOException, IndexOutOfBoundsException {
        List list = new ArrayList();

        try (BufferedReader reader = new BufferedReader(new FileReader(tutorFile))) {
            String line;
            int i = 0;

            while ((line = reader.readLine()) != null) {
                if (line == null) {
                    break;
                }
                String[] parts = line.split("-");
                //  String[] users = null;
                for (String part : parts) {
                    list.add(part);
                }
            }
            for (i = 0; i < list.size(); i += 5) {

                String id = (String) list.get(i);
                String name = (String) list.get(i + 1);
                String email = (String) list.get(i + 2);

                Tutor tutorObj = new Tutor(id, name, email);
                tutor.add(tutorObj);
            }
        }
        return tutor;
    }

    /**
     * student.txt dosyasindaki student bilgilerini student ArrayList'ine
     * doldurup, bu ArrayListi return eden method
     *
     * @param student Student object
     * @return for exit system
     * @throws FileNotFoundException not found student.txt file
     * @throws IOException for user input errors
     * @throws IndexOutOfBoundsException ArrayList.size()'in disina cikma
     * durumlari
     */
    public ArrayList<Student> loadStudentFile(ArrayList<Student> student) throws FileNotFoundException, IOException, IndexOutOfBoundsException {
        List list = new ArrayList();

        try (BufferedReader reader = new BufferedReader(new FileReader(studentFile))) {
            String line;
            int i = 0;

            while ((line = reader.readLine()) != null) {
                if (line == null) {
                    break;
                }
                String[] parts = line.split("-");
                //  String[] users = null;
                for (String part : parts) {
                    list.add(part);
                }
            }
            for (i = 0; i < list.size(); i += 5) {

                String id = (String) list.get(i);
                String name = (String) list.get(i + 1);
                String email = (String) list.get(i + 2);

                Student studentObj = new Student(id, name, email);
                student.add(studentObj);
            }
        }
        return student;
    }

    /**
     * Verilen file i ekrana basan method
     *
     * @param fileName File object, file name
     * @throws IOException for user input errors
     * @throws FileNotFoundException verilen dosya bulunamadi exceptioni
     */
    public void printFile(File fileName) throws IOException, FileNotFoundException {
        try (
                BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }

                String[] parts = line.split("-");
                for (String part : parts) {
                    System.out.println(part);
                }
                System.out.println();

            }
        }
    }

    /**
     *
     * @param fileName File object, file name
     * @param target file da aranacak target
     * @return boolean - for found, not found
     * @throws FileNotFoundException verilen dosya bulunamadi exceptioni
     * @throws IOException for user input errors
     */
    public boolean searchToFile(File fileName, String target) throws FileNotFoundException, IOException {
        boolean temp = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                if (line == null) {
                    break;
                }
                String[] parts = line.split("-");
                for (String part : parts) {

                    if (part.equals(target)) {
                        temp = true;
                    }
                }
            }

        }

        return temp;
    }

    /**
     * verilen dosyaya, veriln satiri yazma methodu
     *
     * @param fileName File object, file name
     * @param line dosyaya yazilacak olan line - string value
     */
    public static void writeToFile(File fileName, String line) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
                bufferedWriter.newLine();

                bufferedWriter.append(line);
            }

        } catch (IOException ex) {
            ex.getMessage();
        }
    }

    /**
     * verilen dosya icinde verilen user id ye sahip olan kisiyi arama methodu
     *
     * @param fileName File object, file name
     * @param id user id - string value
     * @return line - string value
     * @throws FileNotFoundException verilen dosya bulunamadi exceptioni
     * @throws IOException for user input errors
     */
    public String searchLine(File fileName, String id) throws FileNotFoundException, IOException {
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            while ((line = reader.readLine()) != null) {

                String[] parts = line.split("-");
                for (String part : parts) {

                    if (part.equals(id)) {
                        return line;
                    }
                }

            }

        }
        return line;
    }

    /**
     * verilen dosyadan verilen satiri silen method
     *
     * @param fileName File object, file name
     * @param lineToRemove dosyadan silinecek olan satir - string value
     */
    public void removeLineFromFile(File fileName, String lineToRemove) {

        try {

            File tempFile = new File(fileName.getAbsolutePath() + ".tmp");

            try (BufferedReader br = new BufferedReader(new FileReader(fileName));
                PrintWriter pw = new PrintWriter(new FileWriter(tempFile))) {

                String line = null;

                while ((line = br.readLine()) != null) {

                    if (!line.trim().equals(lineToRemove)) {

                        pw.println(line);
                        pw.flush();
                    }
                }
            }

            //Delete the original file
            if (!fileName.delete()) {
                System.out.println("Could not delete file");
                return;
            }

            //Rename the new file to the filename the original file had.
            if (!tempFile.renameTo(fileName)) {
                System.out.println("Could not rename file");
            }

        } catch (FileNotFoundException ex) {
            ex.getMessage();
        } catch (IOException ex) {
            ex.getMessage();
        }
    }

}
