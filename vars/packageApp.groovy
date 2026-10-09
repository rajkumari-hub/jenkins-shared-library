def call() {
    echo 'Packaging application'
    sh '''
        mkdir -p output
        echo "Sample application package" > output/app.txt
        echo "Application package created"
    '''

    archiveArtifacts artifacts: 'output/**'
}
