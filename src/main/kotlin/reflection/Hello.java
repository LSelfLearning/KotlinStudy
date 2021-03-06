package reflection;

import com.bennyhuo.imooc.reflections.JavaReflectionsKt;
import com.bennyhuo.imooc.reflections.Person;

import java.lang.reflect.InvocationTargetException;

public class Hello {
    public static void main(String... args) {
        try {
            JavaReflectionsKt.class.getDeclaredMethod("sayHello", Person.class).invoke(null, new Person("benny", 18));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
