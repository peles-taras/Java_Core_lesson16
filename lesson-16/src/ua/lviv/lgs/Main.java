package ua.lviv.lgs;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {
	@SuppressWarnings({ "unchecked", "unused" })
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException,
			IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

		Class<Person> p = Person.class;

		System.out.println("MINIMUM:");
		System.out.println("Cannonical name = " + p.getName());

		System.out.println("Simpe name = " + p.getSimpleName());

		int modifier = p.getModifiers();
		String modifierText = Modifier.toString(modifier);
		System.out.println("Modifier: " + modifierText);

		Package getPackage = p.getPackage();
		System.out.println("Package info: " + getPackage);

		@SuppressWarnings("rawtypes")
		Class[] interfaces = p.getInterfaces();
		System.out.println("Intefaces info: " + Arrays.toString(interfaces));

		Constructor<Person>[] pConstructor = (Constructor<Person>[]) p.getConstructors();
		System.out.println("Constructor info: " + Arrays.toString(pConstructor));
		System.out.println("Constructor size: " + pConstructor.length);

		Constructor<Person> p2Constructor = pConstructor[0];
		Class<?>[] parameters = p2Constructor.getParameterTypes();
		int count = 0;
		for (int i = 0; i < parameters.length; i++) {
			Class<?> class1 = parameters[i];
			count++;
			System.out.println("Parameter type " + count + ": " + class1);
		}

		Field[] fields = p.getFields();
		int count2 = 0;
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			count2++;
			System.out.println("Field " + count2 + " info: " + field);
		}
		System.out.println();
		System.out.println("MAXIMUM:");

		Field ageField = p.getField("age");
		Constructor<Person> singleConstructor = p.getConstructor(String.class, int.class);
		Person newInstance = singleConstructor.newInstance("name", 0);
		System.out.println("Before setting name, age: " + newInstance);
		newInstance.setAge(45);
		newInstance.setName("Bruno");
		System.out.println("After setting name, age: " + newInstance);

		System.out.println();

		Method[] methods = p.getMethods();
		int count3 = -1;
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			count3++;
			System.out.println(count3 + " " + method);
		}

	
		System.out.println();
		methods[2].invoke(newInstance, "Joe");
		System.out.println("Changing name with reflection: " + newInstance);
		methods[3].invoke(newInstance, 21);
		System.out.println("Changing age with reflection: " + newInstance);
	}
}
