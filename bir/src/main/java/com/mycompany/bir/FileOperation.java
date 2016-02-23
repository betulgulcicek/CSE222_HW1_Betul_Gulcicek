package com.mycompany.bir;

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
 * @author GULCICEK
 * @version 1.0
 * @created 20-�ub-2016 19:15:07
 */
public class FileOperation {

    String userFile = "user.txt";
    String adminFile = "admin.txt";
    String teacherFile = "teacher.txt";
    String tutorFile = "tutor.txt";
    String studentFile = "student.txt";
    String assignmentFile = "assignment.txt";
    String courseFile = "course.txt";

    public FileOperation() {

    }

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
                String[] users = null;
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
                String[] users = null;
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
                String[] users = null;
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

    public void removeLineFromFile(File fileName, String lineToRemove) {

        try {

            File tempFile = new File(fileName.getAbsolutePath() + ".tmp");

            try (BufferedReader br = new BufferedReader(new FileReader(fileName)); PrintWriter pw = new PrintWriter(new FileWriter(tempFile))) {

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
