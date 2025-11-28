# Chakra Control
Chakra Control is a Minecraft Forge mod for version 1.12.2 that introduces new character movement abilities inspired by the Naruto series. By toggling "Chakra Control," players can manipulate their environment and movement in unique ways.

## Features

*   **Walk on Water**: While Chakra Control is active, players can stand and walk on water surfaces without falling through.
*   **Wall Jump**: When moving against a wall with Chakra Control active, players receive a vertical boost, allowing them to scale vertical surfaces.
*   **Toggleable State**: Players can enable or disable Chakra Control at any time using a configurable keybinding.
*   **Server-Side Validation**: All abilities are processed on the server, ensuring they work correctly in multiplayer environments.

## Usage

1.  In Minecraft, go to `Options...` > `Controls...`.
2.  Scroll down to the "ChakraMod" category.
3.  Assign a key to the "Chakra Control" action.
4.  Press the configured key in-game to toggle the abilities on or off. A chat message will confirm the current state.

## Developer Setup

This project uses the Minecraft Forge MDK. The following instructions will guide you through setting up a development environment.

### Prerequisites
*   Java Development Kit (JDK) 8

### 1. Setup
Open a command line or terminal in the root directory of the repository and run the appropriate setup command for your IDE.

**For Eclipse:**
```bash
# For Windows
gradlew genEclipseRuns

# For macOS/Linux
./gradlew genEclipseRuns
```
After the command completes, import the project into Eclipse as an existing Gradle project.

**For IntelliJ IDEA:**
```bash
# For Windows
gradlew genIntellijRuns

# For macOS/Linux
./gradlew genIntellijRuns
```
After the command completes, open your `build.gradle` file in IntelliJ and import the project. Refresh the Gradle project if prompted.

### 2. General Commands

*   **Refresh Dependencies**: If you encounter issues with missing libraries, run the following command to refresh the local cache.
    ```bash
    # Windows
    gradlew --refresh-dependencies
    
    # macOS/Linux
    ./gradlew --refresh-dependencies
    ```

*   **Clean Workspace**: To reset the workspace (this will not affect your source code), run:
    ```bash
    # Windows
    gradlew clean
    
    # macOS/Linux
    ./gradlew clean
    ```

## License

This project is licensed under the GNU General Public License v3.0. See the [LICENSE](./LICENSE) file for details.
