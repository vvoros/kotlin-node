# Create node module in Kotlin and use in an electron app

**my-kotlin-node-module**

IntelliJ IDEA Kotlin Javascript project.

'gradlew build' builds the node module under my-kotlin-node-module/node:

```bash
gradlew build
```

**electron-quick-start**

Simple electron app using my-kotlin-node-module as dependency.
First install electron dependencies:

```bash
npm install
```

Then copy my-kotlin-node-module/node content under electron-quick-start/node_modules/my-kotlin-node-module

Finally start electron app and you'll see the return values from Kotlin node module

```bash
npm start
```
