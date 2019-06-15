package org.smart4j.wqs.day003;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.*;
import java.util.List;
import java.util.Set;

/**
 * InjectPrintProcessor
 *
 * @Title: InjectPrintProcessor.java
 * @Copyright: Copyright (c) 2005
 * @Description:
 * @Company: 互动百科
 * @Created on 2019-6-14 14:36
 * @Author 90
 */
@SupportedAnnotationTypes("org.smart4j.wqs.day003.InjectPrint")
public class InjectPrintProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnvironment) {

        for(Element element : roundEnvironment.getElementsAnnotatedWith(InjectPrint.class)){
            //元素类型是一个方法
            if(element.getKind() == ElementKind.METHOD){
                //强转成方法对应的element，同理，如果你的注解是一个类，那你可以强转成TypeElement
                ExecutableElement executableElement = (ExecutableElement)element;
                //打印方法名
                System.out.println(executableElement.getSimpleName());
                //打印方法的返回类型
                System.out.println(executableElement.getReturnType().toString());
                //获取方法所有的参数
                List<? extends VariableElement> params = executableElement.getParameters();
                //遍历并打印参数名
                for(VariableElement variableElement : params){
                    System.out.println(variableElement.getSimpleName());
                }
                //打印注解的值
                System.out.println("AnnotationValue:"+executableElement.getAnnotation(InjectPrint.class).value());
            }
        }
        return false;
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latestSupported();
    }
}
