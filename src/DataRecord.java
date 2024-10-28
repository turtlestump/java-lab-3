public record DataRecord(int hoursStudied, int attendance, ParentalInvolvement parentalInvolvement,
                         ResourceAccess resourceAccess, boolean extracurriculars, int sleepHours, int previousScores,
                         MotivationLevel motivationLevel, boolean internetAccess, int tutoringSessions,
                         FamilyIncome familyIncome, TeacherQuality teacherQuality, SchoolType schoolType,
                         PeerInfluence peerInfluence, int physicalActivity, boolean learningDisabilities,
                         ParentalEducation parentalEducation, DistanceFromHome distanceFromHome, Gender gender,
                         int examScore) {

    // Category enumerators
    public enum ParentalInvolvement {

        LOW, MEDIUM, HIGH;
        public static ParentalInvolvement parseParentalInvolvement(String parentalInvolvement) {

            switch (parentalInvolvement.strip()) {

                case "Low:": return LOW;
                case "Medium:": return MEDIUM;
                case "High:": return HIGH;
                default: return null;

            }

        }

    }

    public enum ResourceAccess {

        LOW, MEDIUM, HIGH;
        public static ResourceAccess parseResourceAccess(String resourceAccess) {

            switch (resourceAccess.strip()) {

                case "Low:": return LOW;
                case "Medium:": return MEDIUM;
                case "High:": return HIGH;
                default: return null;

            }

        }

    }

    public enum MotivationLevel {

        LOW, MEDIUM, HIGH;
        public static MotivationLevel parseMotivationLevel(String motivationLevel) {

            switch (motivationLevel.strip()) {

                case "Low:": return LOW;
                case "Medium:": return MEDIUM;
                case "High:": return HIGH;
                default: return null;

            }

        }

    }

    public enum FamilyIncome {

        LOW, HIGH;
        public static FamilyIncome parseFamilyIncome(String familyIncome) {

            switch (familyIncome.strip()) {

                case "Low:": return LOW;
                case "High:": return HIGH;
                default: return null;

            }

        }

    }

    public enum TeacherQuality {

        MEDIUM, HIGH;
        public static TeacherQuality parseTeacherQuality(String teacherQuality) {

            switch (teacherQuality.strip()) {

                case "Medium:": return MEDIUM;
                case "High:": return HIGH;
                default: return null;

            }

        }

    }

    public enum SchoolType {

        PUBLIC, PRIVATE;
        public static SchoolType parseSchoolType(String schoolType) {

            switch (schoolType.strip()) {

                case "Public": return PUBLIC;
                case "Private": return PRIVATE;
                default: return null;

            }

        }

    }

    public enum PeerInfluence {

        POSITIVE, NEGATIVE, NEUTRAL;
        public static PeerInfluence parsePeerInfluence(String peerInfluence) {

            switch (peerInfluence.strip()) {

                case "Positive": return POSITIVE;
                case "Negative": return NEGATIVE;
                case "Neutral": return NEUTRAL;
                default: return null;

            }

        }

    }

    public enum ParentalEducation {

        COLLEGE, HIGH_SCHOOL, POSTGRADUATE;
        public static ParentalEducation parseParentalEducation(String parentalEducation) {

            switch (parentalEducation.strip()) {

                case "College": return COLLEGE;
                case "High School": return HIGH_SCHOOL;
                case "Postgraduate": return POSTGRADUATE;
                default: return null;

            }

        }

    }

    public enum DistanceFromHome {

        FAR, MODERATE, NEAR;
        public static DistanceFromHome parseDistanceFromHome(String distanceFromHome) {

            switch (distanceFromHome.strip()) {

                case "Far": return FAR;
                case "Moderate": return MODERATE;
                case "Near": return NEAR;
                default: return null;

            }

        }

    }

    public enum Gender {

        MALE, FEMALE;
        public static Gender parseGender(String gender) {

            switch (gender.strip()) {

                case "Male": return MALE;
                case "Female": return FEMALE;
                default: return null;

            }

        }

    }

}