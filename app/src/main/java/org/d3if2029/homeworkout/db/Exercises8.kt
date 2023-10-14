package org.d3if2029.homeworkout.db

import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.entity.Exercise8Model


class Exercises8 {

    companion object{
        fun defaultExerciseList():ArrayList<Exercise8Model>{
            var exercisesList = ArrayList<Exercise8Model>()

            val Squat = Exercise8Model(1,
                "Squat",
                R.drawable.squat,
                "Squat adalah latihan yang melibatkan menekuk lutut dan pinggul, mirip seperti bergerak untuk duduk di kursi. Ini menguatkan kaki, paha, dan bokong Anda.",
                false,
                false)
            exercisesList.add(Squat)

            val wallSit = Exercise8Model(2,
                "Wall Sit",
                R.drawable.wall_sit,
                "Caranya, berdiri di depan dinding, berjalan kaki beberapa langkah menjauhi dinding, lalu bersandar pada dinding dengan punggung. Selanjutnya, langkahkan kaki ke depan dan berjongkok seperti posisi duduk di kursi, pastikan lutut membentuk sudut 90 derajat dan punggung menempel pada dinding. ",
                false,
                false)
            exercisesList.add(wallSit)

            val Lunges = Exercise8Model(3,
                "Lunges",
                R.drawable.lunge,
                "Lunges adalah latihan yang melibatkan langkah besar ke depan dengan satu kaki dan menekuk lutut hingga sudut 90 derajat, lalu kembali ke posisi berdiri. Ini melatih kaki, paha, dan bokong serta keseimbangan.",
                false,
                false)
            exercisesList.add(Lunges)

            val GluteBridge = Exercise8Model(4,
                "Glute Bridge",
                R.drawable.clutebridge,
                "Glute Bridge adalah latihan di mana Anda angkat pinggul dari lantai dengan fokus pada otot gluteus (bokong) Anda.",
                false,
                false)
            exercisesList.add(GluteBridge)

            val stepUp = Exercise8Model(5,
                "Step-Up Onto Chair",
                R.drawable.stepup,
                "Step-up onto a chair adalah latihan yang melibatkan langkah naik ke atas kursi. Mulailah dengan berdiri di depan kursi. Angkat kaki kanan dan letakkan telapak kaki di atas kursi, kemudian dorong tubuh dengan kaki kanan hingga berdiri penuh di atas kursi. Turunkan tubuh kembali dengan kaki kanan, diikuti kaki kiri. Latihan ini dapat membantu memperkuat otot kaki dan meningkatkan keseimbangan. Pastikan menggunakan kursi yang stabil dan sesuaikan intensitas sesuai tingkat Anda.",
                false,
                false)
            exercisesList.add(stepUp)

            val DonkeyKicks = Exercise8Model(6,
                "Donkey Kicks",
                R.drawable.donkeykicks,
                "Donkey Kicks adalah latihan di mana Anda mengangkat kaki ke belakang sejauh mungkin dari posisi berlutut, fokus pada otot gluteus (bokong).",
                false,
                false)
            exercisesList.add(DonkeyKicks)

            val BoxJumps = Exercise8Model(7,
                "Box Jumps",
                R.drawable.boxjumps,
                "Box Jumps adalah latihan lompatan ke atas kotak atau bangku untuk mengembangkan kekuatan kaki dan daya ledak.",
                false,
                false)
            exercisesList.add(BoxJumps)


            return exercisesList
        }
    }
}