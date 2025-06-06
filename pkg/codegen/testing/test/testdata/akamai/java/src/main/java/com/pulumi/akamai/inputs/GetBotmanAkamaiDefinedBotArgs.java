// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBotmanAkamaiDefinedBotArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBotmanAkamaiDefinedBotArgs Empty = new GetBotmanAkamaiDefinedBotArgs();

    @Import(name="botName")
    private @Nullable Output<String> botName;

    public Optional<Output<String>> botName() {
        return Optional.ofNullable(this.botName);
    }

    private GetBotmanAkamaiDefinedBotArgs() {}

    private GetBotmanAkamaiDefinedBotArgs(GetBotmanAkamaiDefinedBotArgs $) {
        this.botName = $.botName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBotmanAkamaiDefinedBotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBotmanAkamaiDefinedBotArgs $;

        public Builder() {
            $ = new GetBotmanAkamaiDefinedBotArgs();
        }

        public Builder(GetBotmanAkamaiDefinedBotArgs defaults) {
            $ = new GetBotmanAkamaiDefinedBotArgs(Objects.requireNonNull(defaults));
        }

        public Builder botName(@Nullable Output<String> botName) {
            $.botName = botName;
            return this;
        }

        public Builder botName(String botName) {
            return botName(Output.of(botName));
        }

        public GetBotmanAkamaiDefinedBotArgs build() {
            return $;
        }
    }

}
