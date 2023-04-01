package com.example.quizapp

object Constants {
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "Total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What blood types are there?",
            R.drawable.blood_1,
            "1, 2, 3, 4",
            "1, 2, 4",
            "1, 3, 2",
            "2, 4",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            2,
            "What is the Rh factor?",
            R.drawable.blood_2,
            "blood disease",
            "a substance associated with blood clotting",
            "finding a special protein in the erythrocyte",
            "shaped elements of blood",
            3
        )
        questionsList.add(que2)

        val que3 = Question(
            3,
            "Which blood type is considered universal?",
            R.drawable.blood_3,
            "2",
            "1",
            "3 and 4",
            "3",
            2
        )
        questionsList.add(que3)

        val que4 = Question(
            4,
            "What is the Rh factor?",
            R.drawable.blood_4,
            "+, -",
            "++, -, +, --",
            "+",
            "-",
            1
        )
        questionsList.add(que4)

        val que5 = Question(
            5,
            "Who can a person with the third blood group give blood to?",
            R.drawable.blood_5,
            "1, 2",
            "3, 4",
            "2",
            "1",
            2
        )
        questionsList.add(que5)
        return questionsList
    }
}