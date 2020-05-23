# How to setup intellij to actually work with this project

1. Close intellij
2. Install [choose runtime](https://plugins.jetbrains.com/plugin/12836-choose-runtime) plugin
3. Install [liberica jdk 14 - full](https://bell-sw.com/pages/java-14.0.1/) / [direct dl](https://download.bell-sw.com/java/14.0.1+8/bellsoft-jdk14.0.1+8-windows-amd64-full.msi)
4. Start intellij
5. press shift twice and select "Choose runtime..."
6. navigate to liberica's installations path and select it
7. click on `help -> edit custom vm options`
    1. add `-disableassertions:com.oracle.javafx.scenebuilder.kit.metadata.klass.ComponentClassMetadata` after `-ea` in a new line
    2. (The scene builder crashes when we add a custom component because of that error, check `help -> show logs in explorer for the exception`. With that line we force intellij to ignore the error message.)
8. restart intellij
9. have fun