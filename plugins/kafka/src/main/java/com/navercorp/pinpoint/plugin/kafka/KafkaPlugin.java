package com.navercorp.pinpoint.plugin.kafka;

import com.navercorp.pinpoint.bootstrap.instrument.transformer.TransformTemplate;
import com.navercorp.pinpoint.bootstrap.instrument.transformer.TransformTemplateAware;
import com.navercorp.pinpoint.bootstrap.plugin.ProfilerPlugin;
import com.navercorp.pinpoint.bootstrap.plugin.ProfilerPluginSetupContext;

/**
 * @author Milinae Kim
 */
public class KafkaPlugin implements ProfilerPlugin, TransformTemplateAware {

	@Override
	public void setup(ProfilerPluginSetupContext context) {
		KafkaPluginConfig config = new KafkaPluginConfig(context.getConfig());
	}

	@Override
	public void setTransformTemplate(TransformTemplate transformTemplate) {
	}

}
