package Logic;

// Class imports
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public static Object[][] readData(String fileName) throws IOException {

        String contents = Files.readString(Path.of(fileName), StandardCharsets.UTF_8);
        List<String> lines = List.of(contents.split("\n"));              // Split csv by line.
        ArrayList<Object[]> data = lines.stream()
                .skip(1)                                                    // Skip header line.
                .map(line -> line.split(","))                            // Set delimiter to comma.
                .map(FileReader::parseDataRecord)
                .map(DataRecord::toObjectArray)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        return data.toArray(new Object[data.size()][]);

    }

    // Data parser method
    public static DataRecord parseDataRecord(String[] data) {

        return new DataRecord(
                Integer.parseInt(data[0]),                                              // int hoursStudied
                Integer.parseInt(data[1]),                                              // int attendance
                DataRecord.ParentalInvolvement.parseParentalInvolvement(data[2]),       // parentalInvolvement
                DataRecord.ResourceAccess.parseResourceAccess(data[3]),                 // resourceAccess
                Boolean.parseBoolean(data[4]),                                          // boolean extracurriculars
                Integer.parseInt(data[5]),                                              // int sleepHours
                Integer.parseInt(data[6]),                                              // int previousScores
                DataRecord.MotivationLevel.parseMotivationLevel(data[7]),               // motivationLevel
                Boolean.parseBoolean(data[8]),                                          // boolean internetAccess
                Integer.parseInt(data[9]),                                             // int tutoringSessions
                DataRecord.FamilyIncome.parseFamilyIncome(data[10]),                    // familyIncome
                DataRecord.TeacherQuality.parseTeacherQuality(data[11]),                // teacherQuality
                DataRecord.SchoolType.parseSchoolType(data[12]),                        // schoolType
                DataRecord.PeerInfluence.parsePeerInfluence(data[13]),                  // peerInfluence
                Integer.parseInt(data[14]),                                             // int physicalActivity
                Boolean.parseBoolean(data[15]),                                         // boolean learningDisabilities
                DataRecord.ParentalEducation.parseParentalEducation(data[16]),          // parentalEducation
                DataRecord.DistanceFromHome.parseDistanceFromHome(data[17]),            // distanceFromHome
                DataRecord.Gender.parseGender(data[18]),                                // gender
                Integer.parseInt(data[19])                                              // int examScore
        );

    }

}