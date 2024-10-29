package Logic;

public record DataRecord(int hoursStudied, int attendance, ParentalInvolvement parentalInvolvement,
                         ResourceAccess resourceAccess, boolean extracurriculars, int sleepHours, int previousScores,
                         MotivationLevel motivationLevel, boolean internetAccess, int tutoringSessions,
                         FamilyIncome familyIncome, TeacherQuality teacherQuality, SchoolType schoolType,
                         PeerInfluence peerInfluence, int physicalActivity, boolean learningDisabilities,
                         ParentalEducation parentalEducation, DistanceFromHome distanceFromHome, Gender gender,
                         int examScore) {

    // Converter method
    public Object[] toObjectArray() {

        return new Object[] { hoursStudied, attendance, parentalInvolvement, resourceAccess, extracurriculars,
                              sleepHours, previousScores, motivationLevel, internetAccess, tutoringSessions,
                              familyIncome, teacherQuality, schoolType, peerInfluence, physicalActivity,
                              learningDisabilities, parentalEducation, distanceFromHome, gender, examScore };

    }

    // Category enumerators
    public enum ParentalInvolvement {

        LOW, MEDIUM, HIGH;
        public static ParentalInvolvement parseParentalInvolvement(String parentalInvolvement) {

            return switch (parentalInvolvement.strip()) {

                case "Low" -> LOW;
                case "Medium" -> MEDIUM;
                case "High" -> HIGH;
                default -> null;

            };

        }

    }

    public enum ResourceAccess {

        LOW, MEDIUM, HIGH;
        public static ResourceAccess parseResourceAccess(String resourceAccess) {

            return switch (resourceAccess.strip()) {

                case "Low" -> LOW;
                case "Medium" -> MEDIUM;
                case "High" -> HIGH;
                default -> null;

            };

        }

    }

    public enum MotivationLevel {

        LOW, MEDIUM, HIGH;
        public static MotivationLevel parseMotivationLevel(String motivationLevel) {

            return switch (motivationLevel.strip()) {

                case "Low" -> LOW;
                case "Medium" -> MEDIUM;
                case "High" -> HIGH;
                default -> null;

            };

        }

    }

    public enum FamilyIncome {

        LOW, HIGH;
        public static FamilyIncome parseFamilyIncome(String familyIncome) {

            return switch (familyIncome.strip()) {

                case "Low" -> LOW;
                case "High" -> HIGH;
                default -> null;

            };

        }

    }

    public enum TeacherQuality {

        MEDIUM, HIGH;
        public static TeacherQuality parseTeacherQuality(String teacherQuality) {

            return switch (teacherQuality.strip()) {

                case "Medium" -> MEDIUM;
                case "High" -> HIGH;
                default -> null;

            };

        }

    }

    public enum SchoolType {

        PUBLIC, PRIVATE;
        public static SchoolType parseSchoolType(String schoolType) {

            return switch (schoolType.strip()) {

                case "Public" -> PUBLIC;
                case "Private" -> PRIVATE;
                default -> null;

            };

        }

    }

    public enum PeerInfluence {

        POSITIVE, NEGATIVE, NEUTRAL;
        public static PeerInfluence parsePeerInfluence(String peerInfluence) {

            return switch (peerInfluence.strip()) {

                case "Positive" -> POSITIVE;
                case "Negative" -> NEGATIVE;
                case "Neutral" -> NEUTRAL;
                default -> null;

            };

        }

    }

    public enum ParentalEducation {

        COLLEGE, HIGH_SCHOOL, POSTGRADUATE;
        public static ParentalEducation parseParentalEducation(String parentalEducation) {

            return switch (parentalEducation.strip()) {

                case "College" -> COLLEGE;
                case "High School" -> HIGH_SCHOOL;
                case "Postgraduate" -> POSTGRADUATE;
                default -> null;

            };

        }

    }

    public enum DistanceFromHome {

        FAR, MODERATE, NEAR;
        public static DistanceFromHome parseDistanceFromHome(String distanceFromHome) {

            return switch (distanceFromHome.strip()) {

                case "Far" -> FAR;
                case "Moderate" -> MODERATE;
                case "Near" -> NEAR;
                default -> null;

            };

        }

    }

    public enum Gender {

        MALE, FEMALE;
        public static Gender parseGender(String gender) {

            return switch (gender.strip()) {

                case "Male" -> MALE;
                case "Female" -> FEMALE;
                default -> null;

            };

        }

    }

}