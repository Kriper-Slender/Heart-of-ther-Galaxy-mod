## Heart of the Galaxy Mod
A Minecraft mod for version 1.20.1 (Forge).

### Issues:
1. "Duplicate provider" error when running `./gradlew data`.
2. Missing textures/models in `runClient` as a result.

### Key Files:
- **DataGenerator code:** `src/main/java/.../ModDataGenerator.java`
- **Resources folder:** `src/main/resources/assets/heart_of_the_galaxy/`

### How to reproduce:
- Clone the repo.
- Open in IntelliJ IDEA.
- Run `gradlew genIntellijRuns`.
- Run `./gradlew data` or `runClient`.
