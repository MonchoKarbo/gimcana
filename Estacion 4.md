MISIÓN 4: EL DESPLIEGUE FALLIDO


**Objectivo:**
    
    Reparar el pipeline de Integración Continua (CI/CD) para permitir el despliegue automático de la aplicación.

**Contexto:**

    El equipo de DevOps detectó que el workflow de GitHub Actions está fallando en la fase de build. 
    El ficheiro .github/workflows/main.yml tiene un comando esencial faltante en la sección de construcción.


**Ficheiro YAML (Fragmento):**

        name: Java CI with Gradle
        
        on:
          push:
            branches: [ "main" ]
        
        jobs:
          build:
            runs-on: ubuntu-latest
            steps:
            - uses: actions/checkout@v3
            - name: Set up JDK 17
              uses: actions/setup-java@v3
              with:
                java-version: '17'
                distribution: 'temurin'
            
            - name: Build with Gradle
              run: ___________________  <-- FALTA ALGO AQUÍ
            
            - name: Upload Artifact
              uses: actions/upload-artifact@v3
              with:
                name: app-release
                path: build/libs/

**EL reto:**

    Identifica el comando estándar de Gradle que debe ir en la línea run: 
    para compilar el proyecto y generar los artefactos en la carpeta build/libs/.


**Instruciones:**

    1. Analiza el contexto (es un proyecto Java/Android con Gradle).
    2. Recuerda el comando de terminal que se usa para construir el proyecto sin ejecutar tests (o incluyendo tests, pero el objetivo es el build).
    3. El FLAG: Es el comando exacto que debe escribirse en la línea run: (todo en minúsculas).

Pista: El comando empieza por ./gradlew.
