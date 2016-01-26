// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.15.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AcceptanceTestsHeader.Models
{
    using System;
    using System.Linq;
    using System.Collections.Generic;
    using Newtonsoft.Json;
    using Microsoft.Rest;
    using Microsoft.Rest.Serialization;

    /// <summary>
    /// Defines headers for responseDatetimeRfc1123 operation.
    /// </summary>
    public partial class HeaderResponseDatetimeRfc1123Headers
    {
        /// <summary>
        /// Initializes a new instance of the
        /// HeaderResponseDatetimeRfc1123Headers class.
        /// </summary>
        public HeaderResponseDatetimeRfc1123Headers() { }

        /// <summary>
        /// Initializes a new instance of the
        /// HeaderResponseDatetimeRfc1123Headers class.
        /// </summary>
        public HeaderResponseDatetimeRfc1123Headers(DateTime? value = default(DateTime?))
        {
            Value = value;
        }

        /// <summary>
        /// response with header values "Wed, 01 Jan 2010 12:34:56 GMT" or
        /// "Mon, 01 Jan 0001 00:00:00 GMT"
        /// </summary>
        [JsonConverter(typeof(DateTimeRfc1123JsonConverter))]
        [JsonProperty(PropertyName = "value")]
        public DateTime? Value { get; set; }

    }
}
