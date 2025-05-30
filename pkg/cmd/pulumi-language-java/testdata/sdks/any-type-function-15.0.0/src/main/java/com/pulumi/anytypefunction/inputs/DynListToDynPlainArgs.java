// *** WARNING: this file was generated by pulumi-language-java. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.anytypefunction.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DynListToDynPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final DynListToDynPlainArgs Empty = new DynListToDynPlainArgs();

    @Import(name="inputs")
    private @Nullable List<Object> inputs;

    public Optional<List<Object>> inputs() {
        return Optional.ofNullable(this.inputs);
    }

    private DynListToDynPlainArgs() {}

    private DynListToDynPlainArgs(DynListToDynPlainArgs $) {
        this.inputs = $.inputs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DynListToDynPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DynListToDynPlainArgs $;

        public Builder() {
            $ = new DynListToDynPlainArgs();
        }

        public Builder(DynListToDynPlainArgs defaults) {
            $ = new DynListToDynPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder inputs(@Nullable List<Object> inputs) {
            $.inputs = inputs;
            return this;
        }

        public Builder inputs(Object... inputs) {
            return inputs(List.of(inputs));
        }

        public DynListToDynPlainArgs build() {
            return $;
        }
    }

}
