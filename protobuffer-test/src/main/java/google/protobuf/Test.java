/**
 * 
 */
package google.protobuf;

/**
 * @author 百岁（baisui@2dfire.com）
 *
 * @date 2016年8月27日
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		FooOuterClass.Foo.Builder builder = FooOuterClass.Foo.newBuilder();
		builder.putValues("name", "baisui");
		builder.putValues("age", "35");

		FooOuterClass.Foo foo = builder.build();

		System.out.println(foo.toByteArray().length);

		foo = FooOuterClass.Foo.parseFrom(foo.toByteArray());
		System.out.println(foo.getValuesOrThrow("name"));
	}

}
