/* Deserialisation :- In an application if we are creating an object will
that object will be stored in heap memeory.Since heap memeory is the part
of JVM and the JVM is the part of RAM memory. we cannot grantee the existing 
of the in the heap memory if we want to retain the object or use 
the same object in future then we need to make the object persistence
in order to make the object in future. to need to copy the object to copy into a file
by copying the object into a file we can make the objects persistents
and we can transfer the object from one location to another location
with the help of files an object can be made persistent only if the object
is serialized an object is said to be serialisation when the 
the serializeable interface is called as marked interface or tagged interface
which provide some instruction to the some instruction to JVM to create
in a special way so that the object can be broken into piecs.
serialization : it is process of convering an object into a stream bytes
Deserialization : It is a process of converting a stream of bytes into a bytes.

*/
import java.io.*;
public class DescDemo implements Serializable {

}