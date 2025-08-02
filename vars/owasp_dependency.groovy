def call(){
  dependencyCheck additionalArguments: '''
    --scan ./src 
    --out dependency-check-report 
    --format ALL 
    --disableAssembly 
    --disableNodeAudit 
    --disableRetirejs 
    --enableExperimental
  ''', odcInstallation: 'OWASP'

  dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
