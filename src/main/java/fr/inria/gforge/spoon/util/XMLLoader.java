package fr.inria.gforge.spoon.util;

import fr.inria.gforge.spoon.SpoonModel;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;

public final class XMLLoader {
	private XMLLoader() {
	}

	public static SpoonModel load(InputStream inputStream) throws Exception {
		JAXBContext jaxbContext = JAXBContext.newInstance(SpoonModel.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		return (SpoonModel) jaxbUnmarshaller.unmarshal(inputStream);
	}
}
