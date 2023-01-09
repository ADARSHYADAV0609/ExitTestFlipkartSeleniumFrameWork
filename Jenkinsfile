pipeline {
    agent any
    stages {
        stage('git repo & clean') {
            steps {
               bat "rmdir  /s /q ExitTestFlipkartSeleniumFrameWork"
                bat "git clone https://github.com/ADARSHYADAV0609/ExitTestFlipkartSeleniumFrameWork"
                bat "mvn clean -f ExitTestFlipkartSeleniumFrameWork"
            }
        }
        stage('install') {
            steps {
                bat "mvn install -f ExitTestFlipkartSeleniumFrameWork"
            }
        }
        stage('test') {
            steps {
                bat "mvn test -f ExitTestFlipkartSeleniumFrameWork"
            }
        }
        stage('package') {
            steps {
                bat "mvn package -f ExitTestFlipkartSeleniumFrameWork"
            }
        }
    }
}
