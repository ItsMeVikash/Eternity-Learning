package vikash.kumar.eternitylearning;

public class WebsiteNameUrlUtil {

    public static Object[] getWebsiteNames(String coursename){
        String[] name=null;
        String[] url=null;
        String picUrl=null;

        if (coursename.equalsIgnoreCase("Android Development")){
            name=new String[]{"GoogleDevelopers","JavaTPoint","TotorialsPoint","GoogleTraining","O7Planning","W3Adda"};
            url=new String[]{"https://developer.android.com/guide/","https://www.javatpoint.com/android-tutorial","https://www.tutorialspoint.com/android/","https://developers.google.com/training/android/","https://o7planning.org/en/11007/android","https://www.w3adda.com/android-tutorial"};
            picUrl="https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/android.jpg?raw=true";
        }
        if (coursename.equalsIgnoreCase("Angular JS")){
            name=new String[]{"OfficialDocumentation","W3Schools","TutorialsPoint","Guru99","Codecademy","TotorialsTeachers","Thinkster"};
            url=new String[]{"https://docs.angularjs.org/tutorial","https://www.w3schools.com/angular/","https://www.tutorialspoint.com/angularjs/","https://www.guru99.com/angularjs-tutorial.html","https://www.codecademy.com/learn/learn-angularjs","https://www.tutorialsteacher.com/angularjs/angularjs-tutorials","https://thinkster.io/topics/angular"};
            picUrl= "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/angularjs.jpg?raw=true";
        }
        if (coursename.equalsIgnoreCase("C")){
            name=new String[]{"TutorialsPoint","CProgramming","Programiz","W3schools","StudyTonight","JavaTPoint","Fresh2Refresh","GeeksforGeeks"};
            url=new String[]{"https://www.tutorialspoint.com/cprogramming/","https://www.cprogramming.com/tutorial/c-tutorial.html","https://www.programiz.com/c-programming","https://www.w3schools.in/c-tutorial/","https://www.studytonight.com/c/","https://www.javatpoint.com/c-programming-language-tutorial","https://fresh2refresh.com/c-programming/","https://www.geeksforgeeks.org/c-programming-language/"};
            picUrl=  "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/c.jpg?raw=true";
        }
        if (coursename.equalsIgnoreCase("C++")){
            name=new String[]{"LearnCPP","CplusPlus","TutorialsPoint","Programiz","SoloLearn","CPPforSchool","JavaTPoint","W3schools","GeeksforGeeks"};
            url=new String[]{"https://www.learncpp.com/","http://www.cplusplus.com/doc/tutorial/","https://www.tutorialspoint.com/cplusplus/","https://www.programiz.com/cpp-programming","https://www.sololearn.com/Course/CPlusPlus/","http://www.cppforschool.com/tutorials.html","https://www.javatpoint.com/cpp-tutorial","https://www.w3schools.in/cplusplus-tutorial/","https://www.geeksforgeeks.org/c-plus-plus/"};
            picUrl=  "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/cpp.png?raw=true";
        }
        if (coursename.equalsIgnoreCase("Current Affairs")){
            name=new String[]{"IndiaBix","Exambazaar","StudyLion","GKIndia","Affairscloud","EPW"};
            url=new String[]{"http://www.indiabix.com/current-affairs/","http://www.exambazaar.com/","http://www.studylion.com/","https://www.gktoday.in/","https://www.affairscloud.com/","https://www.epw.in/"};
            picUrl=   "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/currentaffairs.jpg?raw=true";
        }
        if (coursename.equalsIgnoreCase("Entrance Exam")){
            name=new String[]{"Recruitment","Mysarkarinaukri","Entrance360","Successcds"};
            url=new String[]{"http://recruitmentexams2018.blogspot.com/?m=1","https://www.mysarkarinaukri.com/","https://www.entrance360.com/","https://www.successcds.net/"};
            picUrl= "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/entranceexam.jpg?raw=true";
        }
        if (coursename.equalsIgnoreCase("Gate")){
            name=new String[]{"Gateforum","Nptel","Aceenggacademy","Madeeasy"};
            url=new String[]{"https://gateforum.com/courses/online-targate-plus/","https://nptel.ac.in/gate_paper.php","https://www.aceenggacademy.com/gate-2019-ace-online-test-series/","https://onlinetestseriesmadeeasy.in/"};
            picUrl=  "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/gate.jpg?raw=true";
        }
        if (coursename.equalsIgnoreCase("GK")){
            name=new String[]{"Edudose","Indiabix","Allindiaexams","Gkexams","Tcyonline"};
            url=new String[]{"https://www.edudose.com/gk/","https://www.indiabix.com/online-test/general-knowledge-test/","http://www.allindiaexams.in/online-test/online-general-knowledge-test/all","https://www.gkexams.com/india-gk-mock-test-in-hindi.html","https://www.tcyonline.com/exam-preparation-general-knowledge-gk-test/100379/general-knowledge"};
            picUrl= "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/gk.jpeg?raw=true";
        }
        if (coursename.equalsIgnoreCase("Html/CSS")){
            name=new String[]{"W3schoolsHTML","W3schoolsCSS","LearnShayhowe","Codecademy","TutorialspointCSS","TutorialspointHTML","JavaTPointHTML","JavaTPointCSS","GeeksforGeeksHtml","GeeksforGeeksCSS"};
            url=new String[]{"https://www.w3schools.com/html/default.asp","https://www.w3schools.com/css/default.asp","https://learn.shayhowe.com/html-css/","https://www.codecademy.com/learn/learn-html","https://www.tutorialspoint.com/css/","https://www.tutorialspoint.com/html/","https://www.javatpoint.com/html-tutorial","https://www.javatpoint.com/css-tutorial","https://www.geeksforgeeks.org/html-tutorials/","https://www.geeksforgeeks.org/css-tutorials/"};
            picUrl=  "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/html.jpg?raw=true";
        }
        if (coursename.equalsIgnoreCase("Interview")){
            name=new String[]{"How to crack ?","All Programming Interview Questions","Common Questions","Top 14 Questions"};
            url=new String[]{"https://www.tutorialspoint.com/cracking_interviews/index.htm","https://www.javatpoint.com/interview-questions-and-answers","https://fairygodboss.com/career-topics/interviewing-questions-and-answers","https://careersidekick.com/what-to-say-in-a-job-interview-questions-and-answers/"};
            picUrl= "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/interview.jpg?raw=true";
        }
        if (coursename.equalsIgnoreCase("IOS Development")){
            name=new String[]{"AppleDeveloper","TutorialsPoint","AppCoda"};
            url=new String[]{"https://developer.apple.com/library/archive/referencelibrary/GettingStarted/DevelopiOSAppsSwift/","https://www.tutorialspoint.com/ios/","https://www.appcoda.com/tutorials/ios/"};
            picUrl=  "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/ios.jpg?raw=true";
        }
        if (coursename.equalsIgnoreCase("JEE")){
            name=new String[]{"iitjeephysics4u","JeeMainGuru","JeeMain","JeeAdvance","IITLectures","OnlineTest","Videos"};
            url=new String[]{"https://www.iitjeephysics4u.com/","https://jeemain.guru/","https://www.toppr.com/exams/jee-main/","https://www.toppr.com/exams/jee-advanced/","https://www.iitjeelectures.com/","https://jeemainonline.in/","http://www.kaysonseducation.co.in/"};
            picUrl="https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/iit.jpg?raw=true";
        }
        if (coursename.equalsIgnoreCase("Java")){
            name=new String[]{"TutorialsPoint","W3schools","OracleDocumentation","Guru99","JavaTPoint","GeeksforGeeks"};
            url=new String[]{"https://www.tutorialspoint.com/java/","https://www.w3schools.com/java/","https://docs.oracle.com/javase/tutorial/","https://www.guru99.com/java-tutorial.html","https://www.javatpoint.com/java-tutorial","https://www.geeksforgeeks.org/java/"};
            picUrl=  "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/java.jpg?raw=true";
        }
        if (coursename.equalsIgnoreCase("Javascript")){
            name=new String[]{"W3schools","JavaScriptInfo","TutorialsPoint","GeeksforGeeks","Guru99","JavaTPoint"};
            url=new String[]{"https://www.w3schools.com/js/","https://javascript.info/","https://www.tutorialspoint.com/javascript/","https://www.geeksforgeeks.org/javascript-tutorial/","https://www.guru99.com/interactive-javascript-tutorials.html","https://www.javatpoint.com/javascript-tutorial"};
            picUrl=  "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/javascript.png?raw=true";
        }
        if (coursename.equalsIgnoreCase("Job Search")){
            name=new String[]{"LinkedIn","69Jobs","Naukri","Glassdoor","AngelList","Monster","TimesJob","Shine","CutShort","FresherWorld"};
            url=new String[]{"https://in.linkedin.com/jobs/","http://www.69jobs.com/","https://www.naukri.com/","https://www.glassdoor.co.in","https://angel.co/","https://www.monsterindia.com/","https://www.timesjobs.com/","https://www.shine.com/","https://cutshort.io/","https://www.freshersworld.com/"};
            picUrl=  "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/job.jpg?raw=true";
        }
        if (coursename.equalsIgnoreCase("Junit")){
            name=new String[]{"Guru99","Vogella","TutorialsPoint","JavaTPoint","Baeldung","JunitOfficial"};
            url=new String[]{"https://www.guru99.com/junit-tutorial.html","http://www.vogella.com/tutorials/JUnit/article.html","https://www.tutorialspoint.com/junit/","https://www.javatpoint.com/junit-tutorial","https://www.baeldung.com/junit","https://junit.org/"};
            picUrl=  "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/junit.png?raw=true";
        }
        if (coursename.equalsIgnoreCase("Mysql")){
            name=new String[]{"TutorialsPoint","MySqlOfficial","JavaTPoint","Quackit"};
            url=new String[]{"https://www.tutorialspoint.com/mysql/","http://www.mysqltutorial.org/","https://www.javatpoint.com/mysql-tutorial","https://www.quackit.com/mysql/tutorial/"};
            picUrl= "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/mysql.jpg?raw=true";
        }
        if (coursename.equalsIgnoreCase("Online Compiler")){
            name=new String[]{"CodeChef","IdeOne","CompileOnline","OnlineGDB","CodePad","JsFiddle","JDoodle","HackerEarth"};
            url=new String[]{"https://www.codechef.com/ide","https://ideone.com/","http://www.compileonline.com/","https://www.onlinegdb.com/","http://codepad.org/","https://jsfiddle.net/","https://www.jdoodle.com/","https://code.hackerearth.com/"};
            picUrl= "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/compiler.jpg?raw=true";
        }
        if (coursename.equalsIgnoreCase("Photography")){
            name=new String[]{"worldphoto","photographyworld","creativelive","alison"};
            url=new String[]{"https://www.worldphoto.org/","http://www.photographyworld.co/","https://www.creativelive.com/photography","https://alison.com/tag/photography"};
            picUrl=  "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/photography.jpg?raw=true";
        }
        if (coursename.equalsIgnoreCase("PHP")){
            name=new String[]{"W3schools","TutorialsPoint","PhpTpoint","GeeksforGeeks","JavaTPoint"};
            url=new String[]{"https://www.w3schools.com/php/","https://www.tutorialspoint.com/php/","https://www.phptpoint.com/php-tutorial/","https://www.geeksforgeeks.org/php/","https://www.javatpoint.com/php-tutorial"};
            picUrl= "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/php.jpg?raw=true";
        }
        if (coursename.equalsIgnoreCase("Python")){
            name=new String[]{"W3schools","TutorialsPoint","Programiz","Guru99","GeeksforGeeks"};
            url=new String[]{"https://www.w3schools.com/python/","https://www.tutorialspoint.com/python/","https://www.programiz.com/python-programming/tutorial","https://www.guru99.com/python-tutorials.html","https://www.geeksforgeeks.org/python-programming-language/"};
            picUrl= "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/python.jpg?raw=true";
        }
        if (coursename.equalsIgnoreCase("Quiz")){
            name=new String[]{"Computer Science topic Wise","Scripting Language Quizes","Java topic wise","Quantitative Aptitude Quiz"};
            url=new String[]{"https://www.geeksforgeeks.org/quiz-corner-gq/","https://www.w3schools.com/quiztest/","https://www.javatpoint.com/examaccess","https://quiz.jagranjosh.com/quantitative-aptitude/"};
            picUrl= "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/quiz.jpg?raw=true";
        }
        if (coursename.equalsIgnoreCase("Selenium")){
            name=new String[]{"Guru99","Toosqa","JavaTpoint","TutorialsPoint"};
            url=new String[]{"https://www.guru99.com/selenium-tutorial.html","https://www.toolsqa.com/selenium-tutorial/","https://www.javatpoint.com/selenium-tutorial","https://www.tutorialspoint.com/selenium/"};
            picUrl= "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/selenium.jpg?raw=true";
        }
        if (coursename.equalsIgnoreCase("Servlet")){
            name=new String[]{"JavaTPoint","TutorialsPoint","BeginnersBook","StudyTonight","GeeksforGeeks"};
            url=new String[]{"https://www.javatpoint.com/servlet-tutorial","https://www.tutorialspoint.com/servlets/","https://beginnersbook.com/2013/05/servlet-tutorial/","https://www.studytonight.com/servlet/","https://www.geeksforgeeks.org/introduction-java-servlets/"};
            picUrl= "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/servlet.png?raw=true";
        }
        if (coursename.equalsIgnoreCase("Spring")){
            name=new String[]{"JavaTPoint","TutorialsPoint","SpringOfficial","Baeldung","Java4s"};
            url=new String[]{"https://www.javatpoint.com/spring-tutorial","https://www.tutorialspoint.com/spring/","https://spring.io/guides","https://www.baeldung.com/spring-tutorial","https://www.java4s.com/spring/"};
            picUrl=  "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/spring.png?raw=true";
        }
        if (coursename.equalsIgnoreCase("TestNG")){
            name=new String[]{"TestNG Official","TutorialsPoint","Mkyong"};
            url=new String[]{"https://testng.org/","https://www.tutorialspoint.com/testng/","http://www.mkyong.com/tutorials/testng-tutorials/"};
            picUrl=  "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/testng.png?raw=true";
        }
        if (coursename.equalsIgnoreCase("UPSC")){
            name=new String[]{"Chanakya","Drishti","TotorialPoint","onestopias"};
            url=new String[]{"https://www.chanakyaiasacademy.com/","https://www.drishtiias.com/","https://www.tutorialspoint.com/upsc_ias_exams.htm","http://www.onestopias.com/tutorials/"};
            picUrl= "https://github.com/ItsMeVikash/Eternity-Learning/blob/master/imageSliding/upsc.jpg?raw=true";
        }

        return new Object[]{name, url,picUrl};
    }

}