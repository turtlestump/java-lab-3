// Class imports
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public static ArrayList<DataRecord> readData(String fileName) throws IOException {

        String contents = Files.readString(Path.of(fileName), StandardCharsets.UTF_8);
        List<String> lines = List.of(contents.split("\n"));                   // Split csv by line.
        ArrayList<DataRecord> records = new ArrayList<>();
        records = lines.stream()
                .skip(1)                                                    // Skip header line.
                .map(line -> line.split(","))                            // Set delimiter to comma.
                .map(FileReader::parseDataRecord)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        return records;

    }

    // Data parser method
    public static DataRecord parseDataRecord(String[] data) {

        DataRecord datum = new DataRecord(
                Integer.parseInt(data[0]),                                              // int hoursStudied
                Integer.parseInt(data[1]),                                              // int attendance
                DataRecord.ParentalInvolvement.parseParentalInvolvement(data[3]),       // parentalInvolvement
                DataRecord.ResourceAccess.parseResourceAccess(data[4]),                 // resourceAccess
                Boolean.parseBoolean(data[5]),                                          // boolean extracurriculars
                Integer.parseInt(data[6]),                                              // int sleepHours
                Integer.parseInt(data[7]),                                              // int previousScores
                DataRecord.MotivationLevel.parseMotivationLevel(data[8]),               // motivationLevel
                Boolean.parseBoolean(data[9]),                                          // boolean internetAccess
                Integer.parseInt(data[10]),                                             // int tutoringSessions
                DataRecord.FamilyIncome.parseFamilyIncome(data[11]),                    // familyIncome
                DataRecord.TeacherQuality.parseTeacherQuality(data[12]),                // teacherQuality
                DataRecord.SchoolType.parseSchoolType(data[13]),                        // schoolType
                DataRecord.PeerInfluence.parsePeerInfluence(data[14]),                  // peerInfluence
                Integer.parseInt(data[15]),                                             // int physicalActivity
                Boolean.parseBoolean(data[16]),                                         // boolean learningDisabilities
                DataRecord.ParentalEducation.parseParentalEducation(data[17]),          // parentalEducation
                DataRecord.DistanceFromHome.parseDistanceFromHome(data[18]),            // distanceFromHome
                DataRecord.Gender.parseGender(data[19]),                                // gender
                Integer.parseInt(data[20])                                              // int examScore
        );

        return datum;

    }

}