## About
Keeps the device awake (Stop from falling asleep) without changing any configuration

*   Used the mouse movement feature to keep the device active to keep your automated tests running

*   No configuration needed on the system or device

*   Customize the timeout of the utility, stops after the configured timeout automatically

## Configuration
Below configurations can be updated based on your needs.

| *Property* | *Description*                                                                               |
| --- |---------------------------------------------------------------------------------------------|
| `timeoutInSeconds` | utility automatically stops after these many seconds. Default time is 3600 seconds (1 hour) |

## Usage

#### Maven
```xml
<dependency>
    <groupId>in.testonics.omni</groupId>
    <artifactId>keepalive</artifactId>
    <version>1.0.0</version>
</dependency>
```
#### Gradle
```groovy
compile 'in.testonics.omni:keepalive:1.0.0'
```

#### Keep your device awake (Strops from Sleeping) programmatically
```java
        //Sets the object of Visual Comparison
        VisualComparison visualComparison = new VisualComparison();

        //By default, result file will be saved at root location of the project
        File file1 = new File(".\\ImageExpected.png");
        File file2 = new File(".\\ImageActual.png");
        VisualComparisonResult visualComparisonResult = visualComparison.compareImages(file1, file2);
```
## Demo
Demo shows how `Visual` works.
 
Expected Image
![expected](src/test/resources/TestData/ImageExpected.png)

Actual Image
![actual](src/test/resources/TestData/ImageActual.png)

Result
![result](src/test/resources/TestData/ImageResult.png)

Print the Failures To Assert
```java
        //Import the utility
        import static in.testonics.omni.models.KeepAlive.keepAliveByMouseMove;

        //Optional Parameter: timeoutInSeconds
        //if not provided, utility will stop after 1 hour
        keepAliveByMouseMove(10); 
```

## License
This project is Apache License 2.0 - see the [LICENSE](LICENSE) file for details

## Release Notes

Can be found in [RELEASE_NOTES](RELEASE_NOTES.md).

## Code of Conduct
Please, follow [Code of Conduct](CODE_OF_CONDUCT.md) page.

#### Also if you're interesting - see my other repositories
*   [Visual](https://github.com/testoncis/visual) - Textual and Visual Comparison Of Images
