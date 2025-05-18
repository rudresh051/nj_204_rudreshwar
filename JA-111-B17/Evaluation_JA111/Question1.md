| Component | Stands For               | Description                                                                                                | Contains                                                                            | Use                                         |
| --------- | ------------------------ | ---------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ------------------------------------------- |
| **JVM**   | Java Virtual Machine     | It is the **runtime engine** that executes Java bytecode. Every Java program runs inside the JVM.          | - Class loader<br>- Bytecode verifier<br>- Runtime engine                           | Runs Java bytecode (i.e., `.class` files)   |
| **JRE**   | Java Runtime Environment | It provides the **environment** to run Java applications. It includes the JVM + libraries.                 | - JVM<br>- Set of libraries (Java Class Libraries)<br>- Deployment tools            | Used to run Java programs (but not develop) |
| **JDK**   | Java Development Kit     | It is the **full development kit** for Java. It includes JRE + tools to develop, compile, debug Java apps. | - JRE (includes JVM)<br>- Compiler (`javac`)<br>- Debugger<br>- Documentation tools | Used to **develop and run** Java programs   |

---

### 🔁 Hierarchical Relationship:

```
JDK
 └── JRE
      └── JVM
```

---

### ✅ Summary:

* **JVM**: Just runs Java bytecode.
* **JRE**: Can **run** Java programs (includes JVM + libraries).
* **JDK**: Can **develop and run** Java programs (includes JRE + dev tools).
