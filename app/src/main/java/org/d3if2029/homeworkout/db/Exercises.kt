package org.d3if2029.homeworkout.db

import org.d3if2029.homeworkout.R
import org.d3if2029.homeworkout.entity.ExerciseModel

class Exercises {

    companion object{
        fun defaultExerciseList():ArrayList<ExerciseModel>{
            var exercisesList = ArrayList<ExerciseModel>()

            val jumpingJacks = ExerciseModel(1,
                "Jumping Jacks",
                R.drawable.jumping_jacks,
                "Jumping jack adalah gerakan aerobik dengan melompat sambil membuka dan menutup kaki serta angkat lengan di atas kepala. Berdiri tegak, buka kaki dan angkat lengan pada hitungan satu, lalu kembali ke posisi awal pada hitungan dua. Lakukan gerakan ini secara berulang dengan ritme cepat untuk melatih kardiovaskular dan meningkatkan stamina.",
                "https://youtu.be/V98WvmoY_M0?si=Xa4meYOe4hqT8Tmt",
                false,
                false)
            exercisesList.add(jumpingJacks)

            val wallSit = ExerciseModel(2,
                "Wall Sit",
                R.drawable.wall_sit,
                "Caranya, berdiri di depan dinding, berjalan kaki beberapa langkah menjauhi dinding, lalu bersandar pada dinding dengan punggung. Selanjutnya, langkahkan kaki ke depan dan berjongkok seperti posisi duduk di kursi, pastikan lutut membentuk sudut 90 derajat dan punggung menempel pada dinding. ",
                "https://youtu.be/0pYwisSPGYo?si=gKKEZEt4dLPig8PK",
                false,
                false)
            exercisesList.add(wallSit)

            val pushUp = ExerciseModel(3,
                "Push Ups",
                R.drawable.pushups,
                "Push-up dilakukan dengan posisi tubuh telentang di lantai dan tangan diletakkan sedikit lebih lebar dari bahu. Tekuk siku untuk menurunkan tubuh ke dekat lantai, lalu dorong tubuh kembali ke atas menggunakan lengan. Latihan ini kuat untuk menguatkan otot dada, lengan, dan inti tubuh.",
                "https://youtu.be/fMKBfvsltAQ?si=iqO_QMWST1dW6cTM",
                false,
                false)
            exercisesList.add(pushUp)

            val abCrunch = ExerciseModel(4,
                "Abdominal crunch",
                R.drawable.ab_crunch,
                "Abdominal Crunch adalah latihan yang melibatkan berbaring telentang dengan lutut ditekuk dan telapak kaki rata di lantai. Letakkan tangan di belakang kepala dengan jari-jari terentang. Kemudian, angkat bahu Anda dari lantai dengan menggunakan otot perut, tanpa mengangkat seluruh punggung. Turunkan kembali dengan kendali untuk satu repetisi. Latihan ini bertujuan mengencangkan otot perut bagian atas.",
                "https://youtu.be/MKmrqcoCZ-M?si=DpKMUoTWPf39pVNK",
                false,
                false)
            exercisesList.add(abCrunch)

            val stepUp = ExerciseModel(5,
                "Step-Up Onto Chair",
                R.drawable.stepup,
                "Step-up onto a chair adalah latihan yang melibatkan langkah naik ke atas kursi. Mulailah dengan berdiri di depan kursi. Angkat kaki kanan dan letakkan telapak kaki di atas kursi, kemudian dorong tubuh dengan kaki kanan hingga berdiri penuh di atas kursi. Turunkan tubuh kembali dengan kaki kanan, diikuti kaki kiri. Latihan ini dapat membantu memperkuat otot kaki dan meningkatkan keseimbangan. Pastikan menggunakan kursi yang stabil dan sesuaikan intensitas sesuai tingkat Anda.",
                "https://youtu.be/2qASVSAImj0?si=_EoTswiNfzFLktRB",
                false,
                false)
            exercisesList.add(stepUp)

            val squat = ExerciseModel(6,
                "Squat",
                R.drawable.squat,
                "Squat adalah latihan yang melibatkan posisi berdiri dengan kaki selebar bahu, kemudian menekuk lutut dan pinggul seperti duduk, lalu kembali ke posisi berdiri. Pastikan menjaga punggung lurus dan kaki tetap sejajar saat menurunkan tubuh. Latihan ini efektif untuk menguatkan otot paha, panggul, dan inti tubuh.",
                "https://www.youtube.com/shorts/YeGjTjEpMNo",
                false,
                false)
            exercisesList.add(squat)

            val tricepsDip = ExerciseModel(7,
                "Triceps Dip On Chair",
                R.drawable.triceps_dip,
                "Triceps dip on chair adalah latihan yang dilakukan dengan duduk di kursi, tangan memegang pinggiran kursi di samping pinggul, kaki ditekuk dengan telapak kaki rata di lantai. Geser pinggul keluar dari kursi, lalu tekuk siku hingga tubuh turun ke bawah, dan dorong kembali tubuh ke atas hingga siku lurus. Latihan ini melibatkan otot trisep dan bisa membantu menguatkan lengan bagian belakang.",
                "https://www.youtube.com/shorts/Qz39qVt6NGA",
                false,
                false)
            exercisesList.add(tricepsDip)

            val plank = ExerciseModel(8,
                "Plank",
                R.drawable.plank,
                "Plank adalah latihan di mana Anda berbaring telentang dengan berat tubuh ditopang oleh lengan yang ditekuk, dengan siku berada tepat di bawah bahu. Tubuh membentuk garis lurus dari kepala hingga kaki, dan Anda harus menjaga inti tubuh terasa tegang. ",
                "https://www.youtube.com/shorts/Iw0PXLNKKPE",
                false,
                false)
            exercisesList.add(plank)

            val highKnees = ExerciseModel(9,
                "High Knees Running In Place",
                R.drawable.high_knees,
                "High knees running in place adalah latihan yang melibatkan berlari diam di tempat sambil mengangkat lutut setinggi mungkin secara bergantian. Berdiri tegak, mulailah mengangkat lutut kanan setinggi pinggang sambil berlari di tempat, lalu ganti dengan lutut kiri.",
                "https://www.youtube.com/shorts/0X0Q8wKLEfo",
                false,
                false)
            exercisesList.add(highKnees)

            val lunge = ExerciseModel(10,
                "Lunges",
                R.drawable.lunge,
                "Lunges adalah latihan dengan langkah maju atau mundur menggunakan satu kaki sambil menekuk kedua lutut sehingga membentuk sudut 90 derajat. Mulailah dengan berdiri tegak, lalu langkahkan kaki kanan ke depan atau belakang, tekuk kedua lutut hingga membentuk sudut 90 derajat, dan pastikan lutut belakang hampir menyentuh lantai. Dorong kembali ke posisi berdiri. ",
                "https://www.youtube.com/shorts/LCWWq3Lx2Sk",
                false,
                false)
            exercisesList.add(lunge)

            val pushUpAndRotation = ExerciseModel(11,
                "Push ups And Rotation",
                R.drawable.pushup_and_rotation,
                "Push-ups and rotation adalah latihan yang dimulai dengan posisi push-up tradisional. Setelah melakukan satu push-up, rotasi tubuh ke sisi kiri atau kanan dengan mengangkat satu lengan ke atas dan memutar tubuh ke arah yang sama. Tubuh membentuk garis lurus dari kepala hingga kaki.",
                "https://www.youtube.com/shorts/f0fKuBIV20o",
                false,
                false)
            exercisesList.add(pushUpAndRotation)

            val sidePlank = ExerciseModel(12,
                "Side Plank",
                R.drawable.side_plank,
                "Side plank adalah latihan yang melibatkan berbaring telentang dengan tubuh ditopang oleh satu lengan yang ditekuk, siku berada tepat di bawah bahu. Tubuh membentuk garis lurus dari kepala hingga kaki, dengan posisi tubuh memiring ke samping. Tahan posisi ini dengan satu tangan dan sisi kaki yang bersentuhan dengan lantai.",
                "https://www.youtube.com/shorts/sKMD_pbNm7w",
                false,
                false)
            exercisesList.add(sidePlank)

            return exercisesList
        }
    }
}